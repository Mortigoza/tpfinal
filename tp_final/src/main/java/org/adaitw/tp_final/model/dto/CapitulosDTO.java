package org.adaitw.tp_final.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class CapitulosDTO implements Serializable {
    private int id_capitulo;
    private int numero_capitulo;
    private String nombre_capitulo;
    private int id_nivel;
}
