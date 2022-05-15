package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "respuestas")
public class RespuestasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_respuesta;

    @Column(name = "contenido_respuestas")
    private String contenido_respuestas;

    @Column(name = "es_correcta")
    private int es_correcta;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pregunta")
    private PreguntasEntity preguntas;*/

    /*@ManyToOne()
    @JoinColumn(name="id_pregunta")
    private PreguntasEntity id_pregunta;*/
}
