package org.devdom.influencer.bean;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.primefaces.util.Constants;

/**
 *
 * @author Carlos Vásquez Polanco
 */
@ManagedBean
@RequestScoped
public class AdministrationController implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private FacesContext facesContext;
    private ExternalContext externalContext;    
    private UIViewRoot uiRoot;
    private String viewId;
    private final HttpSession session;

    /**
     * 
     * @param request 
     */
    public AdministrationController(HttpServletRequest request) {
        session = request.getSession();
    }

    /**
     * 
     */
    public AdministrationController(){
        facesContext = FacesContext.getCurrentInstance();
        externalContext = facesContext.getExternalContext();
        session = (HttpSession) externalContext.getSession(true);
        uiRoot = facesContext.getViewRoot();
        viewId = uiRoot.getViewId();
    }
    /**
     * Retornar la versión de JSF que se utiliza en el proyecto
     * @return 
     */
    public String getMojarraVersion(){
        Package p = FacesContext.class.getPackage();
        return p.getImplementationTitle() + " " + p.getImplementationVersion();
    }

    /**
     * Return la versión que se utiliza en el proyecto de PrimeFaces
     * @return 
     */
    public String getPrimefacesVersion(){
        return Constants.ContextParams.class.getPackage().getImplementationTitle() + 
                " " + Constants.ContextParams.class.getPackage().getImplementationVersion();
    }
    
    /**
     * Retornar el Id de grupo en el que se encuentra navegando el usuario
     * @return 
     */
    public String getActiveGroupId(){
        Map<String,String> request = externalContext.getRequestParameterMap();
        return (request.get("g")!=null)?request.get("g"):"";
        
    }

    /**
     * Retornar el indice del menú en que se encuentra activo según el viewId seleccionado
     * @return 
     */
    public int getActiveIndex(){

        switch(viewId){
            case "/groupTop20.xhtml" : return 0;
            case "/groupDetails.xhtml" : return 1;
            case "/groupInfluencerYesterday.xhtml" : return 2;
            case "/groupInfluencerMonth.xhtml" : return 3;
            default : return 0;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String getLastViewId(){
        String lastViewID = (String) session.getAttribute("lastViewID");
        String paramString = "";
        String sep="?";
        String[] localParams = {"pid","groupId","g"};

        for(String param : localParams){
            if(session.getAttribute(param)!=null){
                paramString+=sep+param+"="+session.getAttribute(param);
                sep="&";
            }
        }

        return lastViewID+paramString;
    }
    
    /**
     * 
     * @return 
     */
    public String getCSSStyleHeaderMenu(){

        String currentPage = getViewId();
        String outcome = "<ul class=\"top-ul-menu\">"; 

        String[][] pages = {{"index.xhtml","Inicio"},
                            {"groups.xhtml","Grupos"},
                            {"skills.xhtml","Skills"},
                            {"university.xhtml","Universidades"},
                            {"workplace.xhtml","Plazas de Trabajo"},};

        int idx = 1;
        for(String[] page : pages){
            outcome += getPageOption(currentPage,page[0],page[1]);

            if(idx<pages.length){
                outcome += "<li class=\"menu-top-sep\">&nbsp;/&nbsp;</li>";
            }
            idx++;
        }
        outcome += "</ul>";

        return outcome;
    }

    /**
     * 
     * @param active
     * @param link
     * @param text
     * @return 
     */
    private String getPageOption(String active, String link, String text){
        String styleClass;
        if(active.endsWith(link)){
            styleClass = "menu-top-selected";
        }else{
            styleClass =  "menu-top";
        }
        return "<li class=\""+styleClass+"\"><a href=\""+link+"\">"+text+"</a></li>";
    }
    
    /**
     * 
     * @return 
     */
    public String getViewId(){
        return viewId;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isHomePage(){
        return viewId.endsWith("index.xhtml");
    }
    
}