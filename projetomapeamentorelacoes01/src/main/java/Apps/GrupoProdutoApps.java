package Apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import VO.GrupoProdutoVO;

public class GrupoProdutoApps {
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	GrupoProdutoVO grupoProduto = null;
	
	public void incluir( GrupoProdutoVO grupoProduto) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("vendas");
			entityManager = entityManagerFactory.createEntityManager(); 
			entityManager.getTransaction().begin();
			entityManager.persist(grupoProduto);
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
