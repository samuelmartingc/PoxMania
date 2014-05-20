package poxmania.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import poxmania.dao.ProductoDAO;
import poxmania.model.Producto;

@Controller
//@RequestMapping("/index")
public class HelloController1 {

	//@RequestMapping(method = RequestMethod.GET)
        @RequestMapping(value="/index", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        System.out.println("HOLA!!!");
        
        ProductoDAO dao = new ProductoDAO();
        List <Producto> listaProductos = null;
        listaProductos = dao.getTodosProductos();
        
        model.addAttribute("listaProductos", listaProductos);
        model.addAttribute("message", "Spring 3 MVC Hello World");
	return "index";

	}
        
        @RequestMapping(value="/registro", method = RequestMethod.GET)
	public String registro(ModelMap model) {
	return "registro";
	}
	
}