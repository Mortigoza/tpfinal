package org.adaitw.tp_final.service;

import org.adaitw.tp_final.model.dto.CuestionarioDTO;
import org.adaitw.tp_final.model.dto.PreguntasDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CuestionarioService {
    List<CuestionarioDTO> findPreguntasByIdConcepto(Integer id_concepto);
}
