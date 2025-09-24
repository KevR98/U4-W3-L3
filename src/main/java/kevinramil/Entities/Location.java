package kevinramil.Entities;

import jakarta.persistence.*;

// ENTITÀ
@Entity

// LISTA ATTRIBUTI SPECIFICANDO TABELLA E COLONNA
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "città")
    private String città;

    // LISTA COSTRUTTORI
    public Location(String nome, String città) {
        this.nome = nome;
        this.città = città;
    }

    // COSTRUTTORE DELLE ENTITÀ VUOTO
    public Location() {

    }
}
