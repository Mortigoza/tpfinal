package org.adaitw.tp_final.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class CuestionarioDTO implements Serializable {
    PreguntasDTO contenido_pregunta;
    List<RespuestasDTO> contenido_respuestas;

}
