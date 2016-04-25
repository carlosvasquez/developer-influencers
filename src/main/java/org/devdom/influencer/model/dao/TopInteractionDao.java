package org.devdom.influencer.model.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.devdom.influencer.model.dto.TopInteraction;

/**
 *
 * @author Carlos Vasquez Polanco
 */
public class TopInteractionDao implements Serializable{

    private static final long serialVersionUID = -9207151001326325679L;
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("jpa");
   
    public List<TopInteraction> findTopMostLikedPostByGroupId(String groupId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<TopInteraction>) em.createNamedQuery("TopInteractions.findTopMostLikedPostByGroupId")
                    .setParameter("group_id", groupId)
                    .getResultList();
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * 
     * @param groupId
     * @return 
     */
    public List<TopInteraction> findTopMostCommentedPostByGroupId(String groupId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<TopInteraction>) em.createNamedQuery("TopInteractions.findTopMostCommentedPostByGroupId")
                    .setParameter("group_id", groupId)
                    .getResultList();
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * 
     * @param groupId
     * @return
     */
    public List<TopInteraction> findTopMostLikedCommentsByGroupId(String groupId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<TopInteraction>) em.createNamedQuery("TopInteractions.findTopMostLikedCommentsByGroupId")
                    .setParameter("group_id", groupId)
                    .getResultList();
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
}
