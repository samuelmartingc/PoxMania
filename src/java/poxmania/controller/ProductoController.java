/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poxmania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author S
 */
@Controller
public class ProductoController {
    
    @RequestMapping(value="/altaProducto", method = RequestMethod.GET)
	public String altaProducto(ModelMap model) {
            return "altaProducto";
	}
        
        @RequestMapping(value="/insertarProducto", method = RequestMethod.GET)
	public String insertarProducto(ModelMap model) {
            return "opcionesAdminOK";
	}
    
    
}
