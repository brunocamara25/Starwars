package com.brunocamara.letscode.starwars.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity@EqualsAndHashCode@ToString
public class Galaxia {

    @Id @GeneratedValue
    @Getter @Setter
    private long id;
    @Getter@Setter
    private String nome;
    @Getter@Setter
    private int latitude;
    @Getter@Setter
    private int longitude;
    @ManyToOne
    @Getter@Setter
    @JoinColumn(name = "localizacao")
    private Rebelde rebelde;


}
