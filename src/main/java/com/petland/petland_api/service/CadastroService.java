package com.petland.petland_api.service;


import com.petland.petland_api.model.dto.CadastroRequest;
import com.petland.petland_api.model.dto.CadastroResponse;
import com.petland.petland_api.model.entities.CadastroEntity;
import com.petland.petland_api.repository.ClientesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CadastroService {


    @Autowired
    private ClientesRepository clientesRepository;

    public List<CadastroResponse> listar(){
        List<CadastroEntity> entities = clientesRepository.findAll();
        List<CadastroResponse> response = new ArrayList<>();
        for (CadastroEntity entity : entities) {
            CadastroResponse cadastroResponse = new CadastroResponse();
            BeanUtils.copyProperties(entity, cadastroResponse);
            response.add(cadastroResponse);
        }
        return response;
    }

    public Integer gravar(CadastroRequest cadastroRequest){
        CadastroEntity cadastroEntity = new CadastroEntity();
        BeanUtils.copyProperties(cadastroRequest,cadastroEntity);
        clientesRepository.save(cadastroEntity);
        return cadastroEntity.getId();
    }

    public CadastroResponse editar(Integer id, CadastroRequest request){
        CadastroEntity entity = clientesRepository.findById(id).orElse(null);

        if(entity != null){
            BeanUtils.copyProperties(request, entity);
            clientesRepository.save(entity);
            CadastroResponse cadastroResponse = new CadastroResponse();
            BeanUtils.copyProperties(entity, cadastroResponse);
            return cadastroResponse;
        }

        return null;
    }

    public boolean deletar(Integer id){
        CadastroEntity entity = clientesRepository.findById(id).orElse(null);
        if(entity != null){
            clientesRepository.deleteById(id);
            return true;
        }

        return false;
    }

}
