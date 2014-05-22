/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.dao;

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
    
}
