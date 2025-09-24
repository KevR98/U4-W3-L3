package kevinramil.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import kevinramil.Entities.Location;

public class LocationDao {
    private final EntityManager entityManager;

    public LocationDao(EntityManager em) {
        this.entityManager = em;
    }

    public void save(Location location) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(location);

        transaction.commit();
    }
}
