
package poxmania.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import poxmania.dao.PedidoDAO;
import poxmania.dao.ProductoDAO;
import poxmania.dao.RelacionproductopedidoDAO;
import poxmania.model.Pedido;
import poxmania.model.PedidoConProductos;
import poxmania.model.Producto;
import poxmania.model.ProductoCarro;
import poxmania.model.Relacionproductopedido;

@Controller
public class PedidoController {
    @Autowired
    PedidoDAO daoPed;
    @Autowired
    RelacionproductopedidoDAO daoRel;
    @Autowired
    ProductoDAO daoProd;
    
        @RequestMapping(value="/hacerPedido", method = RequestMethod.GET)
	public String hacerPedido(ModelMap model, HttpSession session) {
            
	return "index";
	}
        
        @RequestMapping(value="/editarPedidos", method = RequestMethod.GET)
	public String editarPedidos(ModelMap model) {
            
            List <Pedido> listaPedidos = daoPed.findAll();
            List <PedidoConProductos> listaFinal = new ArrayList <PedidoConProductos>();
            
            for(Pedido ped:listaPedidos){
                List <Relacionproductopedido> listaRelacion = daoRel.findByIdPedido(ped.getIdpedido());
                List <ProductoCarro> listaPC = new ArrayList <ProductoCarro>();
                for(Relacionproductopedido rel:listaRelacion){
                    System.out.println(rel.getCantidad());
                    System.out.println(rel.getProducto().getNombreproducto());
                    listaPC.add(new ProductoCarro(rel.getProducto(),rel.getCantidad()));
                    
                }
                listaFinal.add(new PedidoConProductos(ped, listaPC));
                
            }
            model.addAttribute("listaPedidos", listaFinal);
            return "editarPedidos";
	}
}
