package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class VotoDAOImpl implements VotoDAO {
	
	protected EntityManager conector;

	@Override
	public int contaVoto(int candidato) {
		conector = ServicoDatabaseConnection.getConnection();
		
		try {
			TypedQuery<Long> query = conector.createQuery("SELECT count(voto) FROM voto "
					+ "WHERE voto = " + candidato, Long.class);
			List<Long> results = query.getResultList();
			long qtd = 0;
			
			for (Long long1 : results) {
				qtd = long1;
			}
			
			return (int) qtd;
		} catch(Exception e) {
			e.printStackTrace();
		
			return 0;
		}
		
	}

}
