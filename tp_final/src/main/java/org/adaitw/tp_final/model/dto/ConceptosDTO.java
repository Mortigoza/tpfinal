package org.adaitw.tp_final.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class ConceptosDTO implements Serializable {
    private int id_concepto;
    private String nombre_concepto;
    private int id_capitulo;
    private int numero_concepto;
    private String contenido_concepto;
}
