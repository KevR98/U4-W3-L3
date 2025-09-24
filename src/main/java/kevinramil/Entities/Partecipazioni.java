package kevinramil.Entities;

import jakarta.persistence.*;

// ENTITÀ
@Entity

// LISTA ATTRIBUTI SPECIFICANDO TABELLA E COLONNA
@Table(name = "partecipazioni")
public class Partecipazioni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Column(name = "stato")
    private StatoPartecipazione stato;

    // LISTA COSTRUTTORI
    public Partecipazioni(Persona persona, Evento evento, StatoPartecipazione stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    // COSTRUTTORE DELLE ENTITÀ VUOTO
    public Partecipazioni() {
    }
}
