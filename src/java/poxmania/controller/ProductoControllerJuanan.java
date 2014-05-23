/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import poxmania.dao.ProductoDAO;
import poxmania.model.Producto;


@Controller
public class ProductoControllerJuanan  {
    
    @Autowired
    ProductoDAO producto;
    
    @RequestMapping("/pn")
    public String findByNombre(@RequestParam(value="nombre", required=false, defaultValue="Ca") String nombre, Model model) {
         List <Producto> lista = producto.findByNombreproducto(nombre);
         model.addAttribute("listaProductos",lista);
        return "index";
    }
    
    @RequestMapping("/pc")
    public String findByCategoria(@RequestParam(value="categoria", required=false, defaultValue="Camaras") String categoria, Model model) {
        List <Producto> lista = producto.findByCategoria(categoria);
        model.addAttribute("listaProductos",lista);
        return "index";
    }
    
   @RequestMapping("/pc4")
    public String findByCategoria4(@RequestParam(value="categoria", required=false, defaultValue="Camaras") String categoria, Model model) {
        List <Producto> lista = producto.findByCategoria(categoria);
        model.addAttribute("listaProductos",lista);
        return "index";
    }
    
    @RequestMapping("/pa")
    public String findAll (Model model) {
        List <Producto> lista = producto.findAll();
        model.addAttribute("listaProductos",lista);
        return "index";
    }

}
