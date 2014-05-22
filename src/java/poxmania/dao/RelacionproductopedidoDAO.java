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
import poxmania.model.Relacionproductopedido;

@Component
public class RelacionproductopedidoDAO extends GeneralDAO<Categoria,Integer> {

    public RelacionproductopedidoDAO(){
        super();
    }
   
    public List<Relacionproductopedido> findByIdPedido (int id){
        this.open();
        TypedQuery<Relacionproductopedido> query= getManager().createNamedQuery("Relacionproductopedido.findByIdpedido", Relacionproductopedido.class);
        query.setParameter("idpedido", id);
        List <Relacionproductopedido> lista=query.getResultList();
        this.close();
        return lista;
    }
    
    
}//fin clase