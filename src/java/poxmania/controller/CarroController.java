/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import poxmania.dao.ProductoDAO;
import poxmania.dao.UsuarioDAO;
import poxmania.model.Carro;
import poxmania.model.Producto;
import poxmania.model.ProductoCarro;
import poxmania.model.Usuario;


/**
 *
 * @author Juanan
 */
@Controller
public class CarroController {
    
    @Autowired
    ProductoDAO producto;
    
    @Autowired
    UsuarioDAO usuDAO;
    
    //Carro carro;
    
    
    //ProductoCarro prodCarro;
    
    
///    /MODIFICARLO cambiar la forma de introducir productos en el carro , pasandole al carro el Producto
    @RequestMapping(value="/meterEnCarro" , method = RequestMethod.GET)
    public String meterEnCarro(@RequestParam(value="id") int id, Model model, HttpSession session) {
         Carro carro = (Carro) session.getAttribute("carro");
         Producto prod = producto.get(id);
         ProductoCarro prodcarro = new ProductoCarro(prod,1);
         carro.meterEnCarro(prodcarro);
         session.setAttribute("carro",carro);
         model.addAttribute("listaProductos", session.getAttribute("listaproductos"));
         return "index";
    }
    
    @RequestMapping(value="/sacarDeCarro" , method = RequestMethod.GET)
    public String sacarDeCarro(@RequestParam(value="id") int id, Model model, HttpSession session) {
         Carro carro = (Carro) session.getAttribute("carro");
         carro.sacarDeCarro(id);
         session.setAttribute("carro",carro);
         return "verCarro";
    }
    
    @RequestMapping(value="/incrementar" , method = RequestMethod.GET)
    public String incrementarUnidades(@RequestParam(value="id") int id, Model model, HttpSession session) {
         Carro carro = (Carro) session.getAttribute("carro");
         carro.incrementarUnidades(id, 1);
         session.setAttribute("carro",carro);
         return "verCarro";
    }
    
    @RequestMapping(value="/decrementar" , method = RequestMethod.GET)
    public String decrementarUnidades(@RequestParam(value="id") int id, Model model, HttpSession session) {
         Carro carro = (Carro) session.getAttribute("carro");
         carro.decrementarUnidades(id, 1);
         session.setAttribute("carro",carro);
         return "verCarro";
    }
    
    @RequestMapping(value="/verCarro" , method = RequestMethod.GET)
    public String verCarro(Model model, HttpSession session) {
        model.addAttribute("carro", session.getAttribute("carro"));
        return "verCarro";
    }
    
    @RequestMapping(value="/hacerPedido", method = RequestMethod.GET)
	public String hacerPedido(ModelMap model, HttpSession session) {
            Carro carro = (Carro) session.getAttribute("carro");
            String user = (String) session.getAttribute("user");
            int userid= (int) session.getAttribute("userid");
            Usuario usuario = usuDAO.get(userid);
            if ( (carro!= null) && (!carro.getContenido().isEmpty()) ){ // si no esta vacio
                if (user != ""){
                    model.addAttribute("carro", session.getAttribute("carro"));
                    model.addAttribute("usuario", usuario);
                    return "hacerPedido";
                }
                else{
                    return "loginORegistro";
                }
            }
            else{ //carro vacio
                return "index";
            }
            
	}
        
        @RequestMapping(value="/pagoContraReembolso", method = RequestMethod.GET)
	public String pagoContraReembolso(ModelMap model, HttpSession session) {
            
            return "pagoContraReembolso";
	}
        
        // falta hacerlo
        @RequestMapping(value="/terminarPedido", method = RequestMethod.GET)
	public String terminarPedido(ModelMap model, HttpSession session) {
            Carro carro = (Carro) session.getAttribute("carro");
            return "index";
	}
        
    
}
