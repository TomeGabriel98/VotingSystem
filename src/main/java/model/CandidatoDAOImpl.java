package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class CandidatoDAOImpl implements CandidatoDAO {
	
	protected EntityManager conector;

	@Override
	public Candidato findCandidato(int numero) {
		conector = ServicoDatabaseConnection.getConnection();
		
		try {
			Candidato candidato = conector.find(Candidato.class, numero);
			
			return candidato;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public List<Candidato> listar() {
		conector = ServicoDatabaseConnection.getConnection();
		
		try {
			TypedQuery<Candidato> query = conector.createQuery("SELECT c FROM candidato c", Candidato.class);
			List<Candidato> results = query.getResultList();
			
			for (Candidato candidato : results) {
				System.out.println(candidato);
			}
			
			return results;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
