package com.petland.petland_api.atendimento.services;

import com.petland.petland_api.atendimento.model.dto.AtendimentoRequest;
import com.petland.petland_api.atendimento.model.dto.AtendimentoResponse;
import com.petland.petland_api.atendimento.model.entity.AtendimentoEntity;
import com.petland.petland_api.atendimento.repositories.AtendimentoRepository;
import com.petland.petland_api.cadastro.model.dto.AnimalResponse;
import com.petland.petland_api.cadastro.model.entities.AnimalEntity;
import com.petland.petland_api.cadastro.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository repository;

    public List<AtendimentoResponse> listar(){
        List<AtendimentoEntity> entities = repository.findAll();
        List<AtendimentoResponse> response = new ArrayList<>();
        for (AtendimentoEntity entity : entities) {
            AtendimentoResponse newEntity = new AtendimentoResponse();
            BeanUtils.copyProperties(entity,newEntity);
            response.add(newEntity);
        }
        return response;
    }

    public Integer cadastrar(AtendimentoRequest atendimentoRequest){
        AtendimentoEntity entity = new AtendimentoEntity();
        BeanUtils.copyProperties(atendimentoRequest,entity);
        repository.save(entity);
        return entity.getId();
    }

}
