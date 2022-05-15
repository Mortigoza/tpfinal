package org.adaitw.tp_final.repository;

import org.adaitw.tp_final.model.dto.ConceptosDTO;
import org.adaitw.tp_final.model.entity.ConceptosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConceptosRepository extends JpaRepository<ConceptosEntity, Long> {

   /* @Query(
            value = "SELECT nombre_concepto FROM conceptos WHERE id_capitulo=1",
            nativeQuery = true)
    List<ConceptosDTO> findAllNombre_conceptosById_capitulo();*/

  /*  @Query(
            value = "SELECT contenido_pregunta FROM preguntas JOIN respuestas ON preguntas.id_concepto = respuestas.id_concepto",
            nativeQuery = true)
    ConceptosDTO findAllById_concepto(int id_concepto);*/

    /*@Query(
            value = "SELECT contenido_pregunta FROM preguntas JOIN conceptos ON id_concepto=id_concepto",
            nativeQuery = true)
    List<ConceptosDTO> findPreguntasById_concepto(int id_concepto);*/
}
