package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Usuario;
//Creacion de lista de Usuario
public class ListaUsuarios {
	List <Usuario> listaUsuario = new ArrayList<>();

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
}
