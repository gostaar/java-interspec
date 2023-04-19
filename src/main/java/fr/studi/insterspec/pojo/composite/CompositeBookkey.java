package fr.studi.insterspec.pojo.composite;

import jakarta.persistence.Id;

import java.io.Serializable;

public class CompositeBookkey implements Serializable {

    private Long livre_id;

    private Long genre_id;

    public CompositeBookkey(Long livre_id, Long genre_id) {
        this.livre_id = livre_id;
        this.genre_id = genre_id;
    }
}
