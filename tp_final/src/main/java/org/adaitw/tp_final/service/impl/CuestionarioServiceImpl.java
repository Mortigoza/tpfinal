package org.adaitw.tp_final.service.impl;
/*
import org.adaitw.tp_final.model.dto.CuestionarioDTO;
import org.adaitw.tp_final.model.dto.PreguntasDTO;
import org.adaitw.tp_final.model.dto.RespuestasDTO;
import org.adaitw.tp_final.model.entity.PreguntasEntity;
import org.adaitw.tp_final.model.entity.RespuestasEntity;
import org.adaitw.tp_final.repository.ConceptosRepository;
import org.adaitw.tp_final.repository.CuestionarioRepository;
import org.adaitw.tp_final.repository.PreguntasRepository;
import org.adaitw.tp_final.repository.RespuestasRepository;
import org.adaitw.tp_final.service.ConceptosService;
import org.adaitw.tp_final.service.CuestionarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class CuestionarioServiceImpl implements CuestionarioService {

    @Autowired
    PreguntasRepository preguntasRepository;

    @Autowired
    RespuestasRepository respuestasRepository;

    ModelMapper modelMapper = new ModelMapper();


   @Override
    public List<CuestionarioDTO> findPreguntasByIdConcepto(Integer id_concepto){
        List<PreguntasEntity> preguntasEntities = preguntasRepository.findAllByIdConcepto(id_concepto);
        List<CuestionarioDTO> cuestionarioDTO = new ArrayList<>();
        for (PreguntasEntity preguntas : preguntasEntities){
            List<RespuestasEntity> respuestasEntities = preguntas.getRespuestas();
            PreguntasDTO preguntasDTO = modelMapper.map(preguntas, PreguntasDTO.class);
            List<RespuestasDTO> respuestasDTO = new ArrayList<>();
            for (RespuestasEntity respuestas : respuestasEntities){
                RespuestasDTO respuestasDTO1 = modelMapper.map(respuestas, RespuestasDTO.class);
                respuestasDTO.add(respuestasDTO1);
            }
            cuestionarioDTO.add(new CuestionarioDTO(preguntasDTO, respuestasDTO));
        }
        return cuestionarioDTO;
    }
}
*/