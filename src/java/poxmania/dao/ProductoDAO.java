/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;

import java.util.List;
import javax.persistence.*;
import poxmania.model.Producto;

public class ProductoDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public ProductoDAO() {
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
   /*
     public List<Producto> getProductosNombre(String nombre) {
        return getProductosQuery("l.titulo = \"" + nombre + "\"");
    }

    public List<Producto> getProductosPrecio(double precio) {
        return getProductosQuery("l.precio = " + precio);
    }

    public List<Libro> getTodosLibros() {
        return getLibrosQuery(null);
    }

    private List<Libro> getLibrosQuery(String where) {

        String sql = "select l from Libro l";
        if (where != null) {
            sql += " where " + where;
        }

        Query query = manager.createQuery(sql);
        return (List<Libro>) query.getResultList();
    }

    public void insertarAutor(Autor autor) {
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(autor);
        tx.commit();
        //manager.flush();
    }

    public void insertarLibro(Libro libro) {
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(libro);
        tx.commit();
        //manager.flush();
    }

    public Autor getAutor(int codigoAutor) {
        //String sql = "select a from Autor a where a.idautor = "+codigoAutor;
        //Query query = manager.createQuery(sql);
        //return (Autor) query.getResultList().get(0);
        return manager.find(Autor.class, codigoAutor);
    }  
    
    */
}//fin clase
