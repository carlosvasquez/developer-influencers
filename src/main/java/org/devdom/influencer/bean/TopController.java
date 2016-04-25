package org.devdom.influencer.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;
import org.devdom.influencer.model.dao.TopDao;
import org.devdom.influencer.model.dto.Top;

/**
 *
 * @author Carlos Vásquez Polanco
 */
@ManagedBean
@RequestScoped
public class TopController implements Serializable{

    private static final long serialVersionUID = -4814342987979306328L;
    List<Top> top;
    private static final Logger LOG = Logger.getLogger(TopController.class);
    
    /**
     * Listado de los 20 developers más influyentes de todos los grupos
     * @return 
     */ 
    public List<Top> getTop20Devs(){
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String,String> request = externalContext.getRequestParameterMap();
        
        String groupId = request.get("g");
        try {
            TopDao topdao = new TopDao();
            top = topdao.findTop20Devs(groupId);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            return null;
        }
        return top;
    }
    
    public List<Top> getTop300Devs(){
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String,String> request = externalContext.getRequestParameterMap();
        
        String groupId = request.get("g");
        try {
            TopDao topdao = new TopDao();
            top = topdao.findTop300Devs(groupId);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            return null;
        }
        return top;
    }
    
}
