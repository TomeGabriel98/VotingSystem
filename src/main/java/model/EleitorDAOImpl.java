package model;

import javax.persistence.EntityManager;

public class EleitorDAOImpl implements EleitorDAO {

	protected EntityManager conector;
	
	@Override
	public Eleitor findByTitle(String titulo) {
		conector = ServicoDatabaseConnection.getConnection();
		
		try {
			Eleitor eleitor = conector.find(Eleitor.class, titulo);
			
			return eleitor;
		} catch(Exception e) {
			return null;
		}
	}

}
