/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poxmania.dao;

import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Component;
import poxmania.model.Categoria;
import poxmania.model.Producto;
@Component
public class CategoriaDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public CategoriaDAO() {
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
   
 
    public List<Categoria> getTodasCategorias() {
        return getCategoriasQuery(null);
    }

    private List<Categoria> getCategoriasQuery(String where) {

        String sql = "select l from Categoria l";
        if (where != null) {
            sql += " where " + where;
        }

        Query query = manager.createQuery(sql);
        return (List<Categoria>) query.getResultList();
    }
/*
    public void insertarAutor(Autor autor) {
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(autor);
        tx.commit();
        //manager.flush();
    }
*/
    /*
    public void insertarProducto(Producto producto) {
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(producto);
        tx.commit();
        //manager.flush();
    }
*/
    public Categoria getCategoria(int codigoCategoria) {
        //String sql = "select a from Autor a where a.idautor = "+codigoAutor;
        //Query query = manager.createQuery(sql);
        //return (Autor) query.getResultList().get(0);
        return manager.find(Categoria.class, codigoCategoria);
    }  
    
    
}//fin clase
