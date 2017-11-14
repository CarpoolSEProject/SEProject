package CarpoolDB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Database
{
    public static EntityManagerFactory emf;

    public static void connect() {
        emf = Persistence.createEntityManagerFactory("objectdb://161.246.6.27:80/carpool.odb;user=admin;password=admin");
        EntityManager em = emf.createEntityManager();
    }

    public static EntityManagerFactory getConnection() {
        return emf;
    }

}
