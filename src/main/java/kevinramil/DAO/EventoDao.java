package kevinramil.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import kevinramil.Entities.Evento;

public class EventoDao {
    private final EntityManager entityManager;

    public EventoDao(EntityManager em) {
        this.entityManager = em;
    }

    public void save(Evento evento) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(evento);

        transaction.commit();
    }
}
