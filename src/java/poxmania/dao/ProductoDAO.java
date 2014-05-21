/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import poxmania.model.Producto;

/**
 *
 * @autores 
 */

  
@Component
public class ProductoDAO extends GeneralDAO<Producto,Integer>{
    
      
      public ProductoDAO() {
          super();
        
    }
 
    public List<Producto> findByNombreproducto (String nombre){
        this.open();
        TypedQuery<Producto> query= getManager().createNamedQuery("Producto.findByNombreproducto", Producto.class);
        query.setParameter("nombreproducto", nombre);
        List <Producto> lista=query.getResultList();
        this.close();
        return lista;
    }
    
    public List<Producto> findByDescripcion (String descripcion){
        this.open();
        TypedQuery<Producto> query= getManager().createNamedQuery("Producto.findByDescripcion", Producto.class);
        query.setParameter("descripcion", descripcion);
        List <Producto> lista=query.getResultList();
        this.close();
        return lista;
    }
     
    public List<Producto> findByPrecio (String precio){
        this.open();
        TypedQuery<Producto> query= getManager().createNamedQuery("Producto.findByPrecio", Producto.class);
        query.setParameter("precio", Double.parseDouble(precio));
        List <Producto> lista=query.getResultList();
        this.close();
        return lista;
    }
    
    public List<Producto> findByCategoria (String categoria){
        this.open();
        TypedQuery<Producto> query= getManager().createNamedQuery("Producto.findByCategoria", Producto.class);
        query.setParameter("categoria", categoria);
        List <Producto> lista=query.getResultList();
        this.close();
        return lista;
    }
      
      

    
   
    
}
