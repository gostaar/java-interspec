package fr.studi.insterspec.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity

public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long livre_id;

    private String isbn;

    private String titre;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    private Boolean archive;



}
