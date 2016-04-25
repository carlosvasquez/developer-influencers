package org.devdom.influencer.model.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.devdom.influencer.model.dto.YearStat;

/**
 *
 * @author Carlos Vásquez Polanco
 */
public class StatDao implements Serializable{

    private static final long serialVersionUID = 3430720650459905844L;
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("jpa");
    
    /**
     * Retorno de elemento del dashboard referente a un grupo
     * 
     * @param month
     * @param year
     * @param groupId
     * @param fromId
     * @return 
     */
    public List<YearStat> findMonthsStat(int month, int year, String groupId, String fromId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<YearStat>) em.createNamedQuery("stat.findMonthsStat")
                    .setParameter("month", month)
                    .setParameter("year", year)
                    .setParameter("group_id", groupId)
                    .setParameter("from_id", fromId)
                    .getResultList();
        }finally{
            if(em!=null & em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * 
     * @param fromId
     * @return 
     */
    public List<YearStat> findTopPositionsInTop(String fromId){
        EntityManager em = EMF.createEntityManager();
        try{
            return (List<YearStat>) em.createNamedQuery("YearStat.findTopPositionsInTop")
                    .setParameter("from_id", fromId)
                    .getResultList();
        }finally{
            if(em!=null & em.isOpen())
                em.close();
        }
    }
}
