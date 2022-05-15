package org.adaitw.tp_final.controller;

/*import org.adaitw.tp_final.model.dto.CuestionarioDTO;
import org.adaitw.tp_final.repository.PreguntasRepository;
import org.adaitw.tp_final.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CuestionarioController {

    @Autowired
    CuestionarioService cuestionarioService;

    @Autowired
    PreguntasRepository preguntasRepository;

    @GetMapping("/cuestionario/{id_concepto}")
    public ResponseEntity<List<CuestionarioDTO>> findPreguntasByIdConcepto(@PathVariable Integer id_concepto){
        List<CuestionarioDTO> cuestionario = cuestionarioService.findPreguntasByIdConcepto(id_concepto);
        return ResponseEntity.status(HttpStatus.OK).body(cuestionario);
    }
}
*/