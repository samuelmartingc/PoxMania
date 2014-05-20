
package poxmania.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CategoriaController {
    
    @RequestMapping(value="/adminsdfasdf", method = RequestMethod.GET)
	public String registro(ModelMap model) {
	return "adminLogin";
	}
    
    
}
