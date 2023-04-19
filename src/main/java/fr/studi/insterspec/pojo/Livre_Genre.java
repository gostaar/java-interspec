package fr.studi.insterspec.pojo;

import fr.studi.insterspec.pojo.composite.CompositeBookkey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(CompositeBookkey.class)

public class Livre_Genre {

    @Id
    private Long livre_id;

    @Id
    private Long genre_id;
}
