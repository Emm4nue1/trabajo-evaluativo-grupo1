package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ar.edu.unju.fi.listas.ListaCandidatos;
import ar.edu.unju.fi.model.Candidato;

@Controller
public class CandidatoController {
	ListaCandidatos listaCandidatos = new ListaCandidatos();

	Candidato nuevoCandidato = new Candidato();

	@GetMapping("/NuevoCan")
	public String getIndexPage(Model model) {
		model.addAttribute("candidato", nuevoCandidato);
		return "candidato";
	}

	// devolucion de la aplicacion al cargar un nuevo curso.
	@PostMapping("/candidato/guardar")
	public String guardarCurso(@ModelAttribute("candidato") Candidato nuevoCandidato, Model model) {
		listaCandidatos.setListaCandidatos(nuevoCandidato);
		// mostramos la lista con todos los cursos.
		return ("index");
	}
}
