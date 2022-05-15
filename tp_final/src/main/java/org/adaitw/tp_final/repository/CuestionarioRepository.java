package org.adaitw.tp_final.repository;

import org.adaitw.tp_final.model.dto.CuestionarioDTO;
import org.adaitw.tp_final.model.entity.CuestionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CuestionarioRepository extends JpaRepository<CuestionarioEntity, Long> {

    @Query(
            value = "SELECT nombre_concepto, contenido_pregunta FROM preguntas JOIN conceptos ON preguntas.id_concepto LIKE %:id_concepto%",
            nativeQuery = true)
    List<CuestionarioDTO> findPreguntasByIdConcepto(@Param("id_concepto") Integer id_concepto);

    /*@Query(
            value = "SELECT contenido_pregunta FROM preguntas WHERE preguntas.id_concepto LIKE %:id_concepto%",
            nativeQuery = true)
    List<CuestionarioDTO> findPreguntasByIdConcepto2(@Param("id_concepto") Long id_concepto);

    @Query(
            value = "SELECT contenido_respuesta FROM respuestas WHERE respuestas.id_pregunta LIKE %:id_pregunta%",
            nativeQuery = true)
    List<CuestionarioDTO> findRespuestasByIdPregunta(@Param("id_pregunta") Long id_pregunta);*/
}
