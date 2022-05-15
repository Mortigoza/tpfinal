package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ejemplos")
public class EjemplosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ejemplos;

    @Column(name = "contenido_ejemplo")
    private String contenido_ejemplo;

    @Column(name = "descripcion_ejemplo")
    private String descripcion_ejemplo;

    /*@ManyToOne()
    @JoinColumn(name="id_concepto")
    private ConceptosEntity id_concepto;*/
}
