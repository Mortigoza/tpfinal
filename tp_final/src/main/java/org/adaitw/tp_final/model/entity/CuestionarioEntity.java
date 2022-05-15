package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.adaitw.tp_final.model.dto.ConceptosDTO;
import org.adaitw.tp_final.model.dto.PreguntasDTO;
import org.adaitw.tp_final.model.dto.RespuestasDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuestionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cuestionario;
    private String contenido_pregunta;
    private String nombre_concepto;
    private String contenido_respuesta;
    private int id_pregunta;
}
