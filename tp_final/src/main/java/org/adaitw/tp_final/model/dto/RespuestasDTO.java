package org.adaitw.tp_final.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RespuestasDTO {
    private int id_respuesta;
    private String contenido_respuestas;
    private int id_pregunta;
    private int es_correcta;
}
