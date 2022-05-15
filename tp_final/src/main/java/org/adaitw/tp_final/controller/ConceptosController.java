package org.adaitw.tp_final.controller;

import org.adaitw.tp_final.model.dto.ConceptosDTO;
import org.adaitw.tp_final.model.entity.ConceptosEntity;
import org.adaitw.tp_final.repository.ConceptosRepository;
import org.adaitw.tp_final.service.ConceptosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concepto")
public class ConceptosController {

    @Autowired
    ConceptosRepository conceptosRepository;

    @Autowired
    ConceptosService conceptosService;

    @GetMapping("/lista")
    public List<ConceptosDTO> getConceptosDTO(){
        return conceptosService.findAllConceptos();
    }

    @PostMapping("/crear")
    public String crearConcepto(@RequestBody ConceptosDTO conceptoNuevo){
        System.out.println(conceptoNuevo.toString());
        return conceptosService.crearConcepto(conceptoNuevo);
    }

    @DeleteMapping("/eliminar")
    public String eliminarConcepto (@RequestBody ConceptosDTO conceptoEliminado){
        System.out.println(conceptoEliminado.toString());
        return conceptosService.eliminarConcepto(conceptoEliminado);
    }

    @PutMapping("/actualizar")
    public String actualizarConcepto(@RequestBody ConceptosDTO conceptoActualizado){
        System.out.println(conceptoActualizado.toString());
        return conceptosService.actualizarConcepto(conceptoActualizado);
    }


}
