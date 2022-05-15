package org.adaitw.tp_final.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EjemplosDTO {
    private int id_ejemplos;
    private String contenido_ejemplo;
    private String descripcion_ejemplo;
    private int id_concepto;
}
