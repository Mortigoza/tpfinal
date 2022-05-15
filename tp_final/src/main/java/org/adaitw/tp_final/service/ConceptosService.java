package org.adaitw.tp_final.service;


import org.adaitw.tp_final.model.dto.ConceptosDTO;

import java.util.List;

public interface ConceptosService {
    List<ConceptosDTO> findAllConceptos();
    String crearConcepto(ConceptosDTO conceptoNuevo);
    String eliminarConcepto(ConceptosDTO conceptoEliminado);
    String actualizarConcepto(ConceptosDTO conceptoActualizado);


}
