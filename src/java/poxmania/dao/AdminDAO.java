package poxmania.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import poxmania.dao.GeneralDAO;
import poxmania.model.Administrador;
import poxmania.model.Producto;

/**
 *
 * @autores 
 */

  
@Component
public class AdminDAO extends GeneralDAO<Producto,Integer>{
    
      
      public AdminDAO() {
          super();
        
    }
 
    public List<Administrador> findByNombreAdmin (String nombre, String pass){
        this.open();
        TypedQuery<Administrador> query= getManager().createNamedQuery("Administrador.findByNombreAndPass", Administrador.class);
        query.setParameter("nombre", nombre);
        query.setParameter("pass", pass);
        List <Administrador> lista=query.getResultList();
        this.close();
        return lista;
    }
    
      
      

    
   
    
}