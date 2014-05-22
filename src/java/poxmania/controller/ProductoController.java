/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import poxmania.dao.CategoriaDAO;
import poxmania.dao.ProductoDAO;
import poxmania.model.Categoria;
import poxmania.model.Producto;

/**
 *
 * @author S
 */
@Controller
public class ProductoController {
    @Autowired
    CategoriaDAO daoCat;
    
    @Autowired
    ProductoDAO daoProd;
    
    @RequestMapping(value="/altaProducto", method = RequestMethod.GET)
	public String altaProducto(ModelMap model) {
            List <Categoria> listaCategorias = null;
            listaCategorias = daoCat.findAll();
            model.addAttribute("listaCategorias", listaCategorias);
            return "altaProducto";
	}
        
        @RequestMapping(value="/insertarProducto", method = RequestMethod.GET)
	public String insertarProducto(@RequestParam(value = "nombre") String nombre,
                @RequestParam(value = "categoria") String categoria,
                @RequestParam(value = "descripcion") String descripcion,
                @RequestParam(value = "precio") double precio,
                @RequestParam(value = "imagen") String imagen,
                @RequestParam(value = "stock") int stock,
                ModelMap model) {
            String [] idCat = categoria.split("\\s+");
            Categoria cat = daoCat.get(Integer.parseInt(idCat[0]));
            Producto prod = new Producto(nombre, descripcion, precio,imagen,stock,cat);
            daoProd.save(prod);
            
            return "opcionesAdmin";
	}
        
        @RequestMapping(value="/editarProducto", method = RequestMethod.GET)
	public String editarCategoria(ModelMap model) {
            List <Producto> listaProductos = null;
            listaProductos = daoProd.findAll();
            model.addAttribute("listaProductos", listaProductos);
            return "elegirProducto";
	}
        
        @RequestMapping(value="/editarProductoConcreto", method = RequestMethod.GET)
	public String editarCategoriaConcretapublic (@RequestParam (value = "id", required = false, defaultValue= "1")int idProd, ModelMap model) {
            Producto prod = daoProd.get(idProd);
            List <Categoria> listaCategorias = null;
            listaCategorias = daoCat.findAll();
            model.addAttribute("producto", prod);
            model.addAttribute("listaCategorias", listaCategorias);
            return "editarProducto";
	}
        
        @RequestMapping(value="/editarProductoFin", method = RequestMethod.GET)
	public String editarProductoFin(@RequestParam(value = "nombre") String nombre,
                @RequestParam(value = "categoria") String categoria,
                @RequestParam(value = "idproducto") int id,
                @RequestParam(value = "descripcion") String descripcion,
                @RequestParam(value = "precio") double precio,
                @RequestParam(value = "imagen") String imagen,
                @RequestParam(value = "stock") int stock,
                ModelMap model) {
            Producto producto = daoProd.get(id);
            String [] idCat = categoria.split("\\s+");
            Categoria cat = daoCat.get(Integer.parseInt(idCat[0]));
            producto.setCategoria(cat);
            producto.setDescripcion(descripcion);
            producto.setImagen(imagen);
            producto.setNombreproducto(nombre);
            producto.setPrecio(precio);
            producto.setStock(stock);
            daoProd.update(producto);
            return "adminOpciones";
	}
        
    
    
}
