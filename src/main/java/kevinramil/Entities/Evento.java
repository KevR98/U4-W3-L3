package kevinramil.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

// ENTITÀ
@Entity

// LISTA ATTRIBUTI SPECIFICANDO TABELLA E COLONNA
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titolo")
    private String titolo;
    @Column(name = "data_inizio_evento")
    private LocalDate dataInizioEvento;
    @Column(name = "descrizione")
    private String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento")
    private TipoEvento tipoEvento;
    @Column(name = "numero_max_partecipanti")
    private int numeroMaxPartecipanti;

    // LISTA COSTRUTTORI
    public Evento(String titolo, LocalDate dataInizioEvento, String descrizione, TipoEvento tipoEvento, int numeroMaxPartecipanti) {
        this.titolo = titolo;
        this.dataInizioEvento = dataInizioEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
    }

    // COSTRUTTORE DELLE ENTITÀ VUOTO
    public Evento() {
    }

    //LISTA METODI
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataInizioEvento() {
        return dataInizioEvento;
    }

    public void setDataInizioEvento(LocalDate dataInizioEvento) {
        this.dataInizioEvento = dataInizioEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMaxPartecipanti() {
        return numeroMaxPartecipanti;
    }

    public void setNumeroMaxPartecipanti(int numeroMaxPartecipanti) {
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
    }

    public long getId() {
        return id;
    }

}

