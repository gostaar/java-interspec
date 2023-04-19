package fr.studi.insterspec.pojo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity


public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emprunt_id;

    @ManyToOne
    @JoinColumn(name = "exemplaire_id")
    private Exemplaire exemplaire;

    @ManyToOne
    @JoinColumn(name = "adherent_id")
    private Adherent adherent;

    private LocalDate dateEmprunt;

    private Status statut;


}
