package Apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import VO.VendedorVO;

public class VendedorApps {
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	VendedorVO vendedor = null;
	
	public void incluir( VendedorVO vendedor) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("vendas");
			entityManager = entityManagerFactory.createEntityManager(); 
			entityManager.getTransaction().begin();
			entityManager.persist(vendedor);
			entityManager.getTransaction().commit();
			System.out.println("Inclus�o realizada");
		} catch (Exception e) {
			System.out.println("Inclu��o n�o realizada - "+ e.getMessage());
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
