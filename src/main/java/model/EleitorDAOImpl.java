package model;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EleitorDAOImpl implements EleitorDAO {

	protected EntityManager conector;
	
	@Override
	public Eleitor findByTitle(String titulo) {
		conector = ServicoDatabaseConnection.getConnection();
		
		try {
			Eleitor eleitor = conector.find(Eleitor.class, titulo);
			
			return eleitor;
		} catch(Exception e) {
			System.out.println(e);
			
			return null;
		}
	}

	@Override
	public boolean liberaVoto(String titulo) {
		conector = ServicoDatabaseConnection.getConnection();
		
		try {
			Query query = conector.createNativeQuery("UPDATE eleitor e SET e.libera = true "
					+ "WHERE e.titulo = :titulo", Eleitor.class);
			query.setParameter("titulo", titulo);
			
			conector.getTransaction().begin();
			query.executeUpdate();
			conector.getTransaction().commit();
			
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}

}
