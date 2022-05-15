package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "conceptos")
public class ConceptosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_concepto;

    @Column(name = "nombre_concepto")
    private String nombre_concepto;

    @Column(name = "numero_concepto")
    private int numero_concepto;

    @Column(name = "contenido_concepto")
    private String contenido_concepto;

    @ManyToOne()
    @JoinColumn(name="id_capitulo")
    private CapitulosEntity id_capitulo;

    /*@OneToMany(mappedBy = "id_concepto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PreguntasEntity> preguntas;

    @OneToMany(mappedBy = "id_concepto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EjemplosEntity> ejemplos;*/
}
