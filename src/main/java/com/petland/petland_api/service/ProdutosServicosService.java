package com.petland.petland_api.service;

import com.petland.petland_api.model.dto.ProdutoServicoRequest;
import com.petland.petland_api.model.dto.ProdutoServicoResponse;
import com.petland.petland_api.model.entities.CadastroEntity;
import com.petland.petland_api.model.entities.ProdutoServicoEntity;
import com.petland.petland_api.repository.ProdutoServicoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutosServicosService {

    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    public List<ProdutoServicoResponse> listar(){
        List<ProdutoServicoEntity> entities = produtoServicoRepository.findAll();
        List<ProdutoServicoResponse> response = new ArrayList<>();

        for (ProdutoServicoEntity entity: entities){
            ProdutoServicoResponse produtoServicoResponse = new ProdutoServicoResponse();
            BeanUtils.copyProperties(entity,produtoServicoResponse);
            response.add(produtoServicoResponse);
        }

        return response;
    }

    public Integer gravar(@RequestBody ProdutoServicoRequest requisicao){

        ProdutoServicoEntity produtoServicoEntity = new ProdutoServicoEntity();
        BeanUtils.copyProperties(requisicao,produtoServicoEntity);
        produtoServicoRepository.save(produtoServicoEntity);
        return produtoServicoEntity.getId();

    }

    public ProdutoServicoResponse editar(Integer id, ProdutoServicoRequest request){

        ProdutoServicoEntity entity = produtoServicoRepository.findById(id).orElse(null);

        if(entity != null){
            BeanUtils.copyProperties(request,entity);
            produtoServicoRepository.save(entity);
            ProdutoServicoResponse produtoServicoResponse = new ProdutoServicoResponse();
            BeanUtils.copyProperties(entity,produtoServicoResponse);
            return  produtoServicoResponse;
        }

        return null;

    }

    public boolean deletar(Integer id){
        ProdutoServicoEntity entity = produtoServicoRepository.findById(id).orElse(null);

        if(entity != null){
            produtoServicoRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
