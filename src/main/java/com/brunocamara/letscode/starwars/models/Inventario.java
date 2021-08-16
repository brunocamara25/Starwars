package com.brunocamara.letscode.starwars.models;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
public class Inventario {

    @Id @GeneratedValue
    @Getter
    @Setter
    private long id;
    @ManyToOne
    @Getter@Setter
    @JoinColumn(name = "inventario")
    private Rebelde rebelde;

}
