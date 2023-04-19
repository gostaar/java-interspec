package fr.studi.insterspec.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;


@Getter
@Setter
@Entity


public class Editeur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long editeur_id;

    private String nom;

        public Editeur(String nom) {
        this.nom = nom;
    }

    public Editeur() {

    }

}
