package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.usuario;

@Controller
public class Nuevo_canController {
	usuario nuevo = new usuario();
	@GetMapping("/NuevoCan")
	public String getIndexPage(Model model) {
		model.addAttribute("usuario",nuevo);
		
		return "usuario";
	}
}
	
		

