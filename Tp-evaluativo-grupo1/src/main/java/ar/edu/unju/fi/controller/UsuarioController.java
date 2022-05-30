package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaUsuarios;
import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.model.Usuario;

@Controller

public class UsuarioController {
@Autowired
	ListaUsuarios listaUsuario = new ListaUsuarios();
	Usuario usuar = new Usuario();
	@GetMapping("/nuevoUsuario")
	public String getFormUsuario(Model model){
		model.addAttribute("usuario", usuar);
		return "usuario";
	}
	@PostMapping("/usuario/guardado")
	public String guardarUsuario(@ModelAttribute("Usuario") Usuario usuar){
		listaUsuario.setListaUsuario(usuar);
		//Model model;
		ModelAndView mav = new ModelAndView("redirect:/votaciones");
		
		//hacer html
		return "votaciones";
	}
}
