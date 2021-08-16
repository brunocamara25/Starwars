package com.brunocamara.letscode.starwars.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity@EqualsAndHashCode@ToString
public class Rebelde {

    @Id@GeneratedValue@Getter @Setter
    private long id;
    @Getter@Setter
    private String nome;
    @Getter@Setter
    private String idade;
    @Getter@Setter
    private String genero;
    @ManyToOne(cascade=CascadeType.ALL)@Getter@Setter
    private Galaxia localizacao;
    @OneToOne(cascade=CascadeType.PERSIST)@Getter@Setter
    private Inventario inventario;
    @Getter@Setter
    private boolean isTraidor;
}
