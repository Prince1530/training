package bank;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
public class OrmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("Got the Entity Manager Factory:"+emf);
		EntityManager entityManager = emf.createEntityManager();
		System.out.println("Entity Manager:"+entityManager);
		
		SavingsAccount sa =new SavingsAccount();
		sa.setAccHolder("Prince");
		sa.setaccno=(123);
		sa.setbalance=(5000);
		
		EntityTransaction trans =entityManager.getTransaction();
		trans.begin();
		entityManager.persist(sa);
		trans.commit();
		entityManager.close();
		System.out.println("Entity Manager Closed");
		
	}

}
