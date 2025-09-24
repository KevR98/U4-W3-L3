package kevinramil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import kevinramil.DAO.EventoDao;
import kevinramil.DAO.LocationDao;
import kevinramil.DAO.PartecipazioniDao;
import kevinramil.DAO.PersonaDao;
import kevinramil.Entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-L3pu");

    public static void main(String[] args) {
        // Creo l'entity manager che gestirà tutte le operazioni con il database
        EntityManager em = emf.createEntityManager();

        // DAO
        EventoDao eventoDao = new EventoDao(em);
        PersonaDao personaDao = new PersonaDao(em);
        LocationDao locationDao = new LocationDao(em);
        PartecipazioniDao partecipazioniDao = new PartecipazioniDao(em);

        // Salva una persona
        List<Partecipazioni> listaPartecipazioni = new ArrayList<>();
        Persona persona = new Persona("Mario", "Rossi", "mario.rossi@email.it", LocalDate.of(1990, 5, 20), SessoPersona.M, listaPartecipazioni);
        personaDao.save(persona);

        // Salva una location
        Location location = new Location("Centro Congressi", "Milano");
        locationDao.save(location);

        // Salva un evento
        Evento evento = new Evento("Java Conference", LocalDate.of(2024, 10, 10), "Conferenza Java", TipoEvento.PUBBLICO, 100);
        eventoDao.save(evento);

        // Salva una partecipazione
        Partecipazioni partecipazione = new Partecipazioni(persona, evento, StatoPartecipazione.CONFERMATA);
        partecipazioniDao.save(partecipazione);

        em.close();
        emf.close();

        // Una stampa per verificare che il database sia correttamente connesso
        System.out.println("Test per il controllo del server che sia connesso");
    }
}
