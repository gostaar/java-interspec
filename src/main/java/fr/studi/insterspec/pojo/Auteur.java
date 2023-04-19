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

public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prenom;

    private String nom;

    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Auteur() {

    }

}
