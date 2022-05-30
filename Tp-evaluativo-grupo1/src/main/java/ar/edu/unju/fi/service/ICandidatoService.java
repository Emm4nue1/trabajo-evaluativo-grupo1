package ar.edu.unju.fi.service;
import java.util.List;
import ar.edu.unju.fi.model.Candidato;

public interface ICandidatoService {
public void registrar (Candidato candidato);
public List<Candidato> obtenerLista();
public Candidato buscar(int codigo);
public void eliminarCandidato();
}
