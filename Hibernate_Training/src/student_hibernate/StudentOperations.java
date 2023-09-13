package student_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory e1 = Persistence.createEntityManagerFactory("sinfo");
		EntityManager em = e1.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Varshil");
		
		em.persist(s1);
		
		System.out.println("Data Saved!!!!");
		
		em.getTransaction().commit();
		
	}

}
