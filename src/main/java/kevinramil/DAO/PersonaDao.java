package kevinramil.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import kevinramil.Entities.Persona;

public class PersonaDao {
    private final EntityManager entityManager;

    public PersonaDao(EntityManager em) {
        this.entityManager = em;
    }

    public void save(Persona persona) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(persona);

        transaction.commit();
    }
}
