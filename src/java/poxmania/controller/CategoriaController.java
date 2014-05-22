
package poxmania.controller;
import java.util.List;
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
        
        @RequestMapping(value="/editarCategoria", method = RequestMethod.GET)
	public String editarCategoria(ModelMap model) {
            List <Categoria> listaCategorias = null;
            listaCategorias = daoCat.findAll();
            model.addAttribute("listaCategorias", listaCategorias);
            return "elegirCategoria";
	}
        
        @RequestMapping(value="/editarCategoriaConcreta", method = RequestMethod.GET)
	public String editarCategoriaConcretapublic (@RequestParam (value = "id", required = false, defaultValue= "1")String idCat, ModelMap model) {
            Categoria categoria = daoCat.get(Integer.parseInt(idCat));
            model.addAttribute("categoria", categoria);
            return "editarCategoria";
	}
    
    
        @RequestMapping(value="/editarCategoriaFin", method = RequestMethod.GET)
	public String editarCategoriaFin(@RequestParam(value = "nombreCategoria") String nombreCategoria, 
                @RequestParam(value = "idcategoria") String idCategoria,
                ModelMap model) {
            Categoria categoria = daoCat.get(Integer.parseInt(idCategoria));
            categoria.setNombrecategoria(nombreCategoria);
            daoCat.saveOrUpdate(categoria);
            return "adminOpciones";
	}
}
