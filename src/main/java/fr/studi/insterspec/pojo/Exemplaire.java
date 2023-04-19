package fr.studi.insterspec.pojo;

import fr.studi.insterspec.pojo.composite.CompositeBookkey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(CompositeBookkey.class)

public class Exemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exemplaire_id;

    @ManyToOne
    @JoinColumn(name = "usure_id")
    private Usure usure;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;



}
