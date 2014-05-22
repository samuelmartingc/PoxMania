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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import poxmania.dao.ProductoDAO;
import poxmania.model.Carro;
import poxmania.model.Producto;
import poxmania.model.ProductoCarro;


/**
 *
 * @author Juanan
 */
@Controller
public class CarroController {
    
    @Autowired
    ProductoDAO producto;
    
    
    //Carro carro;
    
    
    //ProductoCarro prodCarro;
    
    
    
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
    
    @RequestMapping(value="/verCarro" , method = RequestMethod.GET)
    public String verCarro(Model model, HttpSession session) {
        model.addAttribute("carro", session.getAttribute("carro"));
        return "verCarro";
    }
    
}
