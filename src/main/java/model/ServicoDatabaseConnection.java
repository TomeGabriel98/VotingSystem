package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class ServicoDatabaseConnection {
	
	@PersistenceContext
	protected static EntityManager entityManager;
	
	public static EntityManager getConnection() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("eleicao");
		entityManager = factory.createEntityManager();
		
		return entityManager;
	}
	
}
