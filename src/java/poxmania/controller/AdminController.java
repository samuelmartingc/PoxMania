package poxmania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

        @RequestMapping(value="/admin", method = RequestMethod.GET)
	public String registro(ModelMap model) {
	return "adminLogin";
	}
        
        @RequestMapping(value="/opcionesAdmin", method = RequestMethod.GET)
	public String opcionesAdmin(ModelMap model) {
            // comprobar contraseña con un dao
	return "adminOpciones";
	}
	
}