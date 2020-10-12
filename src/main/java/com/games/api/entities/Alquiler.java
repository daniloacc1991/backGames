package com.games.api.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "alquiler")
public class Alquiler implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @NotEmpty
    @ManyToOne(optional = false)
    @JoinColumn(name = "juego_id", nullable = false)
    private Juego juego;

    @NotEmpty
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @NotEmpty
    @Column(name = "fecha_fin")
    private Date fechaFin;

    @NotEmpty
    private Double precio;

}
