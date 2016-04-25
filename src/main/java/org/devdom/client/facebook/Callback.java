package org.devdom.client.facebook;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.internal.org.json.JSONArray;
import facebook4j.internal.org.json.JSONException;
import facebook4j.internal.org.json.JSONObject;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.devdom.influencer.Worker;
import org.devdom.influencer.bean.AdministrationController;
import org.devdom.influencer.model.dto.FacebookMember;
import org.devdom.influencer.model.dto.FacebookProfile;
import org.devdom.influencer.util.API;
import facebook4j.internal.logging.Logger;
import java.io.Serializable;


/**
 *
 * @author Carlos Vasquez Polanco
 */
public class Callback extends HttpServlet implements Serializable{

    private static final long serialVersionUID = -3080527969297265840L;
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("jpa");
    private AdministrationController admin;
    private static final Logger LOG = Logger.getLogger(Callback.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String oauthCode = request.getParameter("code");
        admin = new AdministrationController(request);
        
        try {
            facebook.getOAuthAccessToken(oauthCode);
            setProfile(request,facebook);
            response.sendRedirect(request.getContextPath() + "/");
        } catch (FacebookException ex){ 
            LOG.error(ex.getMessage(),ex);
            request.getSession().invalidate();
            
            String viewId = admin.getLastViewId();
        
            if(viewId.length()==0){
                viewId = "index.xhtml";
            }

            response.sendRedirect(request.getContextPath() + viewId);
        }
    }
    
    private void setProfile(HttpServletRequest request, Facebook facebook){
        FacebookProfile profile = new FacebookProfile();
        try {
            String query = API.PROFILE_INFORMATION.replace(":profile-id","me()");

            JSONArray jsonArray = facebook.executeFQL(query);
            
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject json;
                try {
                    json = jsonArray.getJSONObject(i);
                    JSONObject location = json.getJSONObject("current_location");

                    profile.setUid(json.getString("uid"));
                    profile.setFirstName(json.getString("first_name"));
                    profile.setLastName(json.getString("last_name"));
                    profile.setEmail(json.getString("email"));
                    profile.setBirthday(json.getString("birthday_date"));
                    profile.setPic_with_logo(json.getString("pic_big"));
                    profile.setSex(json.getString("sex"));
                    profile.setCurrentLocationId(location.getString("id"));
                    profile.setCurrentLocation(location.getString("name"));
                    request.getSession().setAttribute("profile", profile);

                    syncLocation(location);
                } catch (JSONException ex) {
                    LOG.error(ex.getMessage(),ex);
                }
            }
            
            updateMember(profile);
        } catch (FacebookException ex) {
            LOG.error(ex.getMessage(),ex);
        }
    }
    
    /**
     * 
     * @param profile 
     */
    private void updateMember(FacebookProfile profile){

        EntityManager em = EMF.createEntityManager();
        try{ 
            em.getTransaction().begin();
            FacebookMember member = new FacebookMember();
            member.setUid(profile.getUid());
            member.setBirthdayDate(profile.getBirthday());
            member.setFirstName(profile.getFirstName());
            member.setLastName(profile.getLastName());
            member.setPic(profile.getPic_with_logo());
            member.setSex(profile.getSex());
            member.setEmail(profile.getEmail());
            member.setCurrentLocation(profile.getCurrentLocation());
            member.setCurrentLocationId(profile.getCurrentLocationId());
            em.merge(member);
            em.getTransaction().commit();
        }finally{
            if(em.isOpen())
                em.close();
        }
    }

    private void syncLocation(JSONObject location) {
        EntityManager em = EMF.createEntityManager();
        try {
            Worker.syncLocation(location, "", em);
        } catch (JSONException ex) {
            LOG.error(ex.getMessage(),ex);
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
}