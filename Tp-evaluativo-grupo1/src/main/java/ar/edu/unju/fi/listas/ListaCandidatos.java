package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Candidato;
//creacion de lista
@Component
public class ListaCandidatos {
	List <Candidato> listaCandidatos = new ArrayList<>();
	
	public ListaCandidatos() {}
	
	public ListaCandidatos(List<Candidato> listaCandidatos) {
		super();
		this.listaCandidatos = listaCandidatos;
	}

	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}

	public void setListaCandidatos(List<Candidato> listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}

}
