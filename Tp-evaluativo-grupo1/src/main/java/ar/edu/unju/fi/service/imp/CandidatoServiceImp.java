package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.listas.ListaCandidatos;
import ar.edu.unju.fi.model.Candidato;
import ar.edu.unju.fi.service.ICandidatoService;

@Service ("CandidatoServiceImp")
public class CandidatoServiceImp implements ICandidatoService {
@Autowired
private ListaCandidatos listaCandidatos;

	@Override
	public void registrar(Candidato candidato) {
		listaCandidatos.getListaCandidatos().add(candidato);
	}

	@Override
	public List<Candidato> obtenerLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidato buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCandidato() {
		// TODO Auto-generated method stub

	}

}
