package Apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import VO.ClienteVO;

public class ClienteApps {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	ClienteVO cliente = null;
	
	public void incluir(ClienteVO cliente) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("vendas");
			entityManager = entityManagerFactory.createEntityManager(); 
			entityManager.getTransaction().begin();
			entityManager.persist(cliente);
			entityManager.getTransaction().commit();
			System.out.println("Inclusão realizada");
		} catch (Exception e) {
			System.out.println("Inclução não realizada - "+ e.getMessage());
		}finally {
			if (entityManager!=null) {
				entityManager.close();
			}
			if (entityManagerFactory!= null) {
				entityManagerFactory.close();
			}
		}
	}
	
	
}
