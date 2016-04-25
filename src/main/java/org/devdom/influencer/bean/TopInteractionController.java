package org.devdom.influencer.bean;

import java.util.List;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;
import org.devdom.influencer.model.dao.TopInteractionDao;
import org.devdom.influencer.model.dto.TopInteraction;

/**
 *
 * @author Carlos Vasquez
 */
public class TopInteractionController {
    
    TopInteractionDao dao = new TopInteractionDao();
    private final ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    private final Map<String,String> request = externalContext.getRequestParameterMap();        
    private final String groupId = request.get("g");
    private static final Logger LOG = Logger.getLogger(TopInteractionController.class);
    
    public List<TopInteraction> getTopMostLikedPostByGroupId(){
        try {
            return dao.findTopMostLikedPostByGroupId(groupId);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            return null;
        }
    }
    
    public List<TopInteraction> getTopMostCommentedPostByGroupId(){
        try {
            return dao.findTopMostCommentedPostByGroupId(groupId);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            return null;
        }
    }
    
    public List<TopInteraction> getTopMostLikedCommentsByGroupId(){
        try {
            return dao.findTopMostLikedCommentsByGroupId(groupId);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            return null;
        }
    }
    
}
