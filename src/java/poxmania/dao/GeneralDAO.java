/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;

/**
 *
 * @author S
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class GeneralDAO<T, ID extends Serializable> {


    private EntityManager manager;
    private EntityManagerFactory factory;



    public GeneralDAO() {
        factory = Persistence.createEntityManagerFactory("Poxmania_280PU");
         manager = factory.createEntityManager();
    }
    
    public void open() {

        if (!factory.isOpen()) {
           factory = Persistence.createEntityManagerFactory("Poxmania_280PU");
           
        }

        if (!manager.isOpen()) {
            manager = factory.createEntityManager();
        }
    }

    
    public void saveOrUpdate(T entity)  {
        this.open();
        manager.getTransaction().begin();
        manager.persist(entity);
        manager.getTransaction().commit();
       this.close();
    }

    
    public T get(ID id) {
        this.open();
        manager.getTransaction().begin();
        T entity = (T) manager.find(getEntityClass(), id);
        manager.getTransaction().commit();
        this.close();
        return entity;
    }

    
    public void delete(ID id) {
        this.open();
        manager.getTransaction().begin();
        T entity = (T) manager.find(getEntityClass(), id);
        if (entity != null) {
            manager.remove(entity);
        }
        manager.getTransaction().commit();
        this.close();
    }  

    
    public List<T> findAll() {
        this.open();
        TypedQuery <T> query = manager.createQuery("SELECT e FROM " + getEntityClass().getName() + " e", getEntityClass());
        List<T> entities = query.getResultList();
        this.close();
        return entities;
      }

    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void close() {

        if (manager != null) {
            manager.close();
        }

        if (factory != null) {
            factory.close();
        }
    }
    
    public EntityManager getManager() {
        return manager;
    }
    
}