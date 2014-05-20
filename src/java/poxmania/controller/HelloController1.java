package poxmania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class HelloController1 {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
System.out.println("HOLA!!!");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}
	
}