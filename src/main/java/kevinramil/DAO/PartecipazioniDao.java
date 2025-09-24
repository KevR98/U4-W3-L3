package kevinramil.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import kevinramil.Entities.Partecipazioni;

public class PartecipazioniDao {
    private final EntityManager entityManager;

    public PartecipazioniDao(EntityManager em) {
        this.entityManager = em;
    }

    public void save(Partecipazioni partecipazioni) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(partecipazioni);

        transaction.commit();
    }
}
