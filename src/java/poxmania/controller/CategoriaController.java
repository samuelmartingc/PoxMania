
package poxmania.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import poxmania.dao.CategoriaDAO;
import poxmania.model.Categoria;

@Controller
public class CategoriaController {
        @Autowired
        CategoriaDAO daoCat;
    
        @RequestMapping(value="/nuevaCategoria", method = RequestMethod.GET)
	public String nuevaCategoria(ModelMap model) {
            return "nuevaCategoria";
	}
        
        @RequestMapping(value="/insertarCategoria", method = RequestMethod.GET)
	public String insertarCategoria(@RequestParam(value = "nombreCategoria") String nombreCategoria, 
            ModelMap model) {
            Categoria cat = new Categoria(nombreCategoria);
            daoCat.saveOrUpdate(cat);
            return "adminOpciones";
	}
    
    
}
