package org.devdom.influencer.model.dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Carlos
 * @param <T>
 */
public interface GenericDao<T> {

    public T create(T t);
    public T find(Class Type, Object id);
    public T update(T t);
    public void delete(Class type, Object id);
    public List<T> executeWithNamedQuery(String queryName);
    public List<T> executeWithNamedQuery(String queryName, Map parameters);
    public List<T> executeWithNamedQuery(String queryName, Map parameters, int resultLimit);

}