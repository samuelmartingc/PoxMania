package poxmania.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import poxmania.model.Pedido;

/**
 *
 * @autores: Samuel Martin y Juan Antonio Echeverrias 
 */

@Component
public class PedidoDAO extends GeneralDAO <Pedido, Integer>{

    public PedidoDAO (){
        super();
    }
    
    
    public List<Pedido> findByUserId (int userId){
        TypedQuery<Pedido> query = getManager().createNamedQuery("Pedido.findAll", Pedido.class);
        List <Pedido> listaAux = query.getResultList();
        List <Pedido> lista = new ArrayList<Pedido>();
        for(Pedido ped:listaAux){
            if (ped.getIdusuario().getIdusuario() == userId){
                lista.add(ped);
            }
        }
        return lista;
    }
    /*
    
    public List<Administrador> findByNombreAdmin (String nombre, String pass){
        this.open();
        TypedQuery<Administrador> query= getManager().createNamedQuery("Administrador.findByNombreAndPass", Administrador.class);
        query.setParameter("nombre", nombre);
        query.setParameter("pass", pass);
        List <Administrador> lista=query.getResultList();
        this.close();
        return lista;
    }
    
    */
   
    
}
