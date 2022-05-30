package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Usuario;
//Creacion de lista de Usuario
@Component
public class ListaUsuarios {
	List <Usuario> listaUsuario = new ArrayList<>();

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
}
