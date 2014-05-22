package poxmania.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import poxmania.dao.CategoriaDAO;
import poxmania.dao.ProductoDAO;
import poxmania.model.Carro;
import poxmania.model.Categoria;
import poxmania.model.Producto;

@Controller
//@RequestMapping("/index")
public class IndexController {
    
        @Autowired
        ProductoDAO dao;
        
        @Autowired
        CategoriaDAO daoCat;
 /*
	//@RequestMapping(method = RequestMethod.GET)
        @RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(ModelMap model) {
       
        ProductoDAO dao = new ProductoDAO();
        List <Producto> listaProductos = null;
        listaProductos = dao.getTodosProductos();
        
        List <Producto> listaProductos = null;
        listaProductos = dao.findAll();
        
        List <Categoria> listaCategorias = null;
        listaCategorias = daoCat.findAll();
        
        model.addAttribute("listaCategorias", listaCategorias);
        model.addAttribute("listaProductos", listaProductos);
        model.addAttribute("message", "Spring 3 MVC Hello World");
	return "index";

	}
        */
        
        @RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(ModelMap model,HttpSession session) {
        
             
        List <Producto> listaProductos = null;
        //listaProductos = dao.findAll();
        
        if (session.isNew()){ //si la sesión es nueva, creamos una variable carro a null y la guardamos en la sesión
             Carro carro = new Carro();
             session.setAttribute("carro",carro);
             listaProductos = dao.findAll();
             session.setAttribute("listaproductos", listaProductos);
             }    
        
       
        listaProductos=(List <Producto>)session.getAttribute("listaproductos");
        List <Categoria> listaCategorias = null;
        listaCategorias = daoCat.findAll();
        
        model.addAttribute("listaCategorias", listaCategorias);
        model.addAttribute("listaproductos", listaProductos);
        model.addAttribute("message", "Spring 3 MVC Hello World");
	return "index";

	}
        
        
        
        
        @RequestMapping(value="/indexEspecifico", method = RequestMethod.GET)
	public String indexEspecifico(@RequestParam (value = "cat", required = false, defaultValue= "1")String categ, ModelMap model) {
        List <Producto> listaProductos = null;
        listaProductos = dao.findAll();
        
        List <Categoria> listaCategorias = null;
        listaCategorias = daoCat.findAll();
        List <Producto> listAuxProd = new ArrayList<Producto>();
        for (Producto prod: listaProductos){
            if (prod.getCategoria().getIdcategoria() == Integer.parseInt(categ)){
                //listaProductos.remove(prod);
                listAuxProd.add(prod);
            }
        }
        
        
        model.addAttribute("listaCategorias", listaCategorias);
        model.addAttribute("listaProductos", listAuxProd);
	return "index";

	}
        
        
        
        @RequestMapping(value="/registro", method = RequestMethod.GET)
	public String registro(ModelMap model) {
	return "registro";
	}
        
    ////    //MODIFICADO y tn index.jsp el enlace que manda a este método
        @RequestMapping(value="/detallesProducto", method = RequestMethod.GET)
	public String detallesProducto(@RequestParam (value = "id") int id,ModelMap model) {
            Producto producto = dao.get(id);
            model.addAttribute("prod",producto);
	return "detallesProducto";
	}
	
}