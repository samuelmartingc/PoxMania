/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.model;

import java.util.List;

/**
 *
 * @author S
 */
public class PedidoConProductos {

    Pedido pedido;
    List <ProductoCarro> productos;
    
    public PedidoConProductos(Pedido pedido, List<ProductoCarro> productos) {
        this.pedido = pedido;
        this.productos = productos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<ProductoCarro> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoCarro> productos) {
        this.productos = productos;
    }
    
    
    
    

    
    
}
