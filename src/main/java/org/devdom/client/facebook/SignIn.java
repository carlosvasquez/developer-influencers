package org.devdom.client.facebook;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.conf.ConfigurationBuilder;
import facebook4j.internal.logging.Logger;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.devdom.influencer.util.Configuration;

/**
 *
 * @author Carlos Vásquez Polanco
 */
public class SignIn extends HttpServlet{

    private static final long serialVersionUID = -7453606094644144082L;
    private Facebook facebook;
    private static final ConfigurationBuilder CB = Configuration.getFacebookConfig();
    private static final facebook4j.conf.Configuration CONFIGURATION = CB.build();
    private static final Logger LOG = Logger.getLogger(SignIn.class);
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            facebook = new FacebookFactory(CONFIGURATION).getInstance();
            request.getSession().setAttribute("facebook", facebook);

            StringBuffer callbackURL = request.getRequestURL();
            int index = callbackURL.lastIndexOf("/");
            callbackURL.replace(index, callbackURL.length(), "").append("/callback");
            response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
        }catch(IOException ex){
            LOG.error(ex.getMessage(),ex);
        }
    }
    
    /**
     * 
     * @return
     * @throws FacebookException
     * @throws JSONException 
     
    private AccessToken getRawFacebookExchangeToken() throws FacebookException, JSONException{
        
        String appId = CONFIGURATION.getOAuthAppId();
        String secret = CONFIGURATION.getOAuthAppSecret();
        String oldToken = CONFIGURATION.getOAuthAccessToken();
        
        String url = "https://graph.facebook.com/oauth/access_token?client_id="+appId+"&client_secret="+secret+"&grant_type=fb_exchange_token&fb_exchange_token="+oldToken;

        LOG.info("entro a generar el nuevo token con el URL "+ url);
        JSONObject json = getRawFacebookCall(url);

        return new AccessToken(json.getString("access_token"), json.getLong("expires"));
        
    }
    */
    
    /**
     * 
     * @param url
     * @return 
     
    private JSONObject getRawFacebookCall(String url){

        try {
            Client client = Client.create();
            WebResource webResource = client
                .resource(url);
 
            ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);
 
            if (response.getStatus() != 200) {
                    throw new RuntimeException("HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class); 
            output = "{"+output+"}";
            output = output.replace("&expires=", ",expires=");
            return new JSONObject(output);

        } catch (RuntimeException | JSONException ex) { 
            ex.printStackTrace();
        }
        return null;
    }
    * */
}
