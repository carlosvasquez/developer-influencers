package org.devdom.influencer.model.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.devdom.influencer.model.dto.EducationHistory;
import org.devdom.influencer.model.dto.FacebookProfile;
import org.devdom.influencer.model.dto.Skill;
import org.devdom.influencer.model.dto.WorkHistory;

/**
 *
 * @author Carlos Vasquez Polanco
 */
public class ProfileDao implements Serializable{

    private static final long serialVersionUID = -7397141246339445686L;
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("jpa");

    /**
     * 
     * @param profileId
     * @return
     */
    public FacebookProfile getProfileInformation(String profileId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (FacebookProfile) em.createNamedQuery("profile.findProfileInformation")
                    .setParameter("from_id", profileId)
                    .getSingleResult();
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * 
     * @param profileId
     * @return
     */
    public List<Skill> getSkills(String profileId){
        EntityManager em = EMF.createEntityManager();
        try{
            return em.createNamedQuery("Skill.findSkillsByUid")
                    .setParameter("from_id",profileId)
                    .getResultList();
        }finally{
            if(em.isOpen())
                em.close();
        }
    }
    
    /**
     * 
     * @param profileId
     * @return
     */
    public List<WorkHistory> getWorks(String profileId){
        EntityManager em = EMF.createEntityManager();
        try{
            return em.createNamedQuery("WorkHistory.findWorkByUid")
                    .setParameter("from_id", profileId)
                    .getResultList();
        }finally{
            if(em.isOpen())
                em.close();
        }
    }
    
    /**
     * 
     * @param profileId
     * @return
     */
    public List<EducationHistory> getEducationInformation(String profileId){
        EntityManager em = EMF.createEntityManager();
        try{
            return em.createNamedQuery("EducationHistory.findEducationByUid")
                    .setParameter("from_id", profileId)
                    .getResultList();
        }finally{
            if(em.isOpen())
                em.close();
        }
    }
    
}