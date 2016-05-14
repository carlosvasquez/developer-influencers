package org.devdom.influencer.model.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class CrudServiceImpl<T> implements GenericDao<T> {

    @PersistenceContext(unitName = "pu_db")
    protected EntityManager em;

    @Override
    @Transactional
    public T create(T t) {
        this.em.persist(t);
        this.em.flush();
        this.em.refresh(t);
        return t;
    }

    @Override
    public T find(Class Type, Object id) {
        return (T) this.em.find(Type, id);
    }

    @Override
    public T update(T t) {
        return (T) this.em.merge(t);
    }

    @Override
    public List executeWithNamedQuery(String queryName) {
        return this.em.createNamedQuery(queryName).getResultList();
    }

    @Override
    public List executeWithNamedQuery(String queryName, Map parameters) {
        return executeWithNamedQuery(queryName, parameters, 0);
    }

    public List executeWithNamedQuery(String queryName, int resultLimit){
        return this.em.createNamedQuery(queryName).setMaxResults(resultLimit).getResultList();
    }
    
    public List findByNativeQuery(String sql, Class type){
        return this.em.createNativeQuery(sql, type).getResultList();
    }
    
    @Override
    public List executeWithNamedQuery(String namedQueryName, Map parameters, int resultLimit){
        Query query = this.em.createNamedQuery(namedQueryName);
        if(resultLimit > 0){
            query.setMaxResults(resultLimit);
        }
        Iterator<Map.Entry<String, String>> entries = parameters.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.getResultList();
    }

    @Override
    public void delete(Class type, Object id) {
        Object obj = em.getReference(type, id);
        em.remove(obj);
    }
    
}
