package com.games.api.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "juego")
public class Juego implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String titulo;

    @NotEmpty
    private Double precio;

    @NotEmpty
    private Integer ano;
    
    private Boolean disponible;

    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;

    @NotEmpty
    @ManyToOne(optional = false)
    @JoinColumn(name = "protagonista_id", nullable = false)
    private Protagonista protagonista;

    @NotEmpty
    @ManyToOne(optional = false)
    @JoinColumn(name = "productor_id", nullable = false)
    private Productor productor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tecnologia_id", nullable = false)
    @NotEmpty
    @NotNull
    private Tecnologia tecnologia;

}
