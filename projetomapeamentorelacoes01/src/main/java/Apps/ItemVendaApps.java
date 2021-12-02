package Apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ItemVendaApps {
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	ItemVendaApps itemVenda = null;
	
	public void incluir( ItemVendaApps itemVenda) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("vendas");
			entityManager = entityManagerFactory.createEntityManager(); 
			entityManager.getTransaction().begin();
			entityManager.persist(itemVenda);
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
