package model;

import java.util.List;

public interface CandidatoDAO {

	public Candidato findCandidato(int numero);
	public List<Candidato> listar();
}
