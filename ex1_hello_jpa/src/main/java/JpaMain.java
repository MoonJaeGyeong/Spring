import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager entityManager = emf.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        try{
            Member member1 = entityManager.find(Member.class, 10L);

            member1.setName("ZZZ");

            System.out.println("=====================");
            tx.commit();

        } catch (Exception e){
            tx.rollback();
        } finally {
            entityManager.close();
        }
        emf.close();
    }
}
