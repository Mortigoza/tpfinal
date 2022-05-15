package org.adaitw.tp_final.service.impl;

import org.adaitw.tp_final.model.dto.ConceptosDTO;
import org.adaitw.tp_final.model.entity.ConceptosEntity;
import org.adaitw.tp_final.repository.ConceptosRepository;
import org.adaitw.tp_final.service.ConceptosService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConceptosServiceImpl implements ConceptosService {

    @Autowired
    ConceptosRepository conceptosRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<ConceptosDTO> findAllConceptos(){
        List<ConceptosEntity> conceptos = conceptosRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<ConceptosDTO> listaConceptosDTO = new ArrayList<>();
        for (ConceptosEntity conceptosEntity : conceptos){
            ConceptosDTO conceptosDTO = modelMapper.map(conceptosEntity, ConceptosDTO.class);
            listaConceptosDTO.add(conceptosDTO);
        }
        return listaConceptosDTO;
    }


    @Override
    public String crearConcepto(ConceptosDTO conceptoNuevo){
        System.out.println("crearConcepto" + conceptoNuevo.toString());
        ConceptosEntity conceptos = modelMapper.map(conceptoNuevo, ConceptosEntity.class);
        conceptosRepository.save(conceptos);
        return "Usted ha creado exitosamente un concepto.";
    }

    @Override
    public String eliminarConcepto(ConceptosDTO conceptoEliminado) {
        System.out.println("eliminarConcepto" + conceptoEliminado.toString());
        ConceptosEntity conceptosEliminados = modelMapper.map(conceptoEliminado, ConceptosEntity.class);
        conceptosRepository.delete(conceptosEliminados);
        return "Usted ha eliminado exitosamente un concepto.";
    }

    @Override
    public String actualizarConcepto(ConceptosDTO conceptoActualizado) {
        System.out.println("actualizarConcepto" + conceptoActualizado.toString());
        ConceptosEntity conceptosAct = modelMapper.map(conceptoActualizado, ConceptosEntity.class);
        conceptosRepository.save(conceptosAct);
        return "Usted ha actualizado correctamente el concepto.";
    }

}
