package poxmania.dao;


import java.util.List;
import javax.persistence.*;

import poxmania.model.Producto;

public class LibreriaDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public LibreriaDAO() {
        factory = Persistence.createEntityManagerFactory("Poxmania_280PU");
        manager = factory.createEntityManager();
    }

    public void close() {

        if (manager != null) {
            manager.close();
        }

        if (factory != null) {
            factory.close();
        }
    }

    public List<Producto> getLibrosProductos(String titulo) {
        return getProductosQuery("l.titulo = \"" + titulo + "\"");
    }



    public List<Producto> getTodosProductos() {
        return getProductosQuery(null);
    }

    private List<Producto> getProductosQuery(String where) {

        String sql = "select l from Producto l";
        if (where != null) {
            sql += " where " + where;
        }

        Query query = manager.createQuery(sql);
        return (List<Producto>) query.getResultList();
    }

   
}
