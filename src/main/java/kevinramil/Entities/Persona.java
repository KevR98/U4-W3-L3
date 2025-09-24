package kevinramil.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

// ENTITÀ
@Entity

// LISTA ATTRIBUTI SPECIFICANDO TABELLA E COLONNA
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "email")
    private String email;

    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;

    @Enumerated(EnumType.STRING)
    @Column(name = "sesso")
    private SessoPersona sesso;

    @OneToMany(mappedBy = "persona")
    private List<Partecipazioni> listaPartecipazioni;

    // LISTA COSTRUTTORI
    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, SessoPersona sesso, List<Partecipazioni> listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
        this.listaPartecipazioni = listaPartecipazioni;
    }

    // COSTRUTTORE DELLE ENTITÀ VUOTO
    public Persona() {
    }

    // LISTA METODI
}
