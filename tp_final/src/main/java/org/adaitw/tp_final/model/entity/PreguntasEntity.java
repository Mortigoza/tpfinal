package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "preguntas")
public class PreguntasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pregunta;

    @Column(name = "contenido_pregunta")
    private String contenido_pregunta;

    @ManyToOne()
    @JoinColumn(name="id_concepto")
    private ConceptosEntity id_concepto;

    /*@OneToOne(mappedBy = "preguntas")
    private RespuestasEntity respuestas;*/

    /*@OneToMany(mappedBy = "id_pregunta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RespuestasEntity> respuestas;*/

}
