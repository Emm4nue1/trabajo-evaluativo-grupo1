package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.usuario;

public class ListaUsuarios {
	List <usuario> listaUsuario = new ArrayList<>();

	public List<usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
}
