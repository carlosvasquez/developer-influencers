package org.devdom.influencer.model.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.devdom.influencer.model.dto.Influencer;
import org.devdom.influencer.model.dto.TopThreeInformation;

/**
 *
 * @author Carlos Vásquez Polanco
 */
public class InfluencerDao implements Serializable{

    private static final long serialVersionUID = -7984884775653820682L;
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("jpa");

    /**
     * Top 20 de los developers más influyentes a nivel general
     * 
     * @param groupId
     * @return
     */
    public List<Influencer> findTop20DevsInfluencer(String groupId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<Influencer>) em.createNamedQuery("Influencer.findTop20DevsInfluents")
                    .setParameter("group_id", groupId)
                    .getResultList();
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * Retorna un listado de 3 developers. En medio la cuenta actual con las 
     * dos posiciones anteriores y siguientes a el
     * 
     * @param fromId
     * @param groupId
     * @return
     */
    public List<TopThreeInformation> findPositionCarruselByUserIdAndGroupId(String fromId, String groupId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<TopThreeInformation>)em.createNamedQuery("TopThreeInformation.findPositionCarruselByUserIdAndGroupId")
                    .setParameter("from_id", fromId)
                    .setParameter("group_id", groupId)
                    .getResultList();
        }finally{
            if(em!=null & em.isOpen()){
                em.close();
            }
        }
    }

}