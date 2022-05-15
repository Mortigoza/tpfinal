package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "capitulos")
public class CapitulosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_capitulo;

    @Column(name = "numero_capitulo")
    private int numero_capitulo;

    @Column(name = "nombre_capitulo")
    private String nombre_capitulo;

    @Column(name = "id_nivel")
    private int id_nivel;

    @OneToMany(mappedBy = "id_capitulo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ConceptosEntity> conceptos;
}
