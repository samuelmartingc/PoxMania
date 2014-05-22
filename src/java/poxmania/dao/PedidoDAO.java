/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import poxmania.model.Pedido;
import poxmania.model.PedidoConProductos;
import poxmania.model.ProductoCarro;

/**
 *
 * @autores: Samuel Martin y Juan Antonio Echeverrias 
 */

@Component
public class PedidoDAO extends GeneralDAO <Pedido, Integer>{

    
    public PedidoDAO (){
        super();
    }
    
    
}
