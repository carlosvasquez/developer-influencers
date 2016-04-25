package org.devdom.influencer.model.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.devdom.influencer.model.dto.Top;

/**
 *
 * @author Carlos Vásquez Polanco
 */
public class TopDao implements Serializable{

    private static final long serialVersionUID = -1906991153038758508L;

    /**
     * Top 20 de los developers más influyentes a nivel general
     * 
     * @param groupId
     * @return
     */
    public List<Top> findTop20Devs(String groupId){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        List<Top> list;
        try{
            list = (List<Top>) em.createNamedQuery("Top.findTop20DevsInfluents")
                    .setParameter("group_id", groupId)
                    .getResultList();
        }finally{
            if(em!=null & em.isOpen()){
                em.close();
            }

            if(emf.isOpen()){
                emf.close();
            }
        }
        return list;
    }
    
    /**
     * Top 300 de los developers más influyentes según su trayectoría
     * 
     * @param groupId
     * @return
     */
    public List<Top> findTop300Devs(String groupId){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        List<Top> list;
        try{
            list = (List<Top>) em.createNamedQuery("Top.findTop300DevsInfluents")
                    .getResultList();
        }finally{
            if(em!=null & em.isOpen()){
                em.close();
            }
            if(emf.isOpen()){
                emf.close();
            }
        }
        return list;
    }

}