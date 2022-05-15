package org.adaitw.tp_final.repository;

import org.adaitw.tp_final.model.dto.PreguntasDTO;
import org.adaitw.tp_final.model.entity.PreguntasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PreguntasRepository extends JpaRepository<PreguntasEntity, Long> {

    @Query(
            value = "SELECT contenido_pregunta FROM preguntas WHERE id_concepto LIKE %:id_concepto%",
            nativeQuery = true)
    List<PreguntasEntity> findAllByIdConcepto(@Param("id_concepto")Integer id_concepto);
}
