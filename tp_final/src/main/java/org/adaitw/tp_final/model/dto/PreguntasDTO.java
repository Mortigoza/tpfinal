package org.adaitw.tp_final.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PreguntasDTO {
    private int id_pregunta;
    private String contenido_pregunta;
    private int id_concepto;
}
