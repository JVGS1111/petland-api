package com.petland.petland_api.controller;

import com.petland.petland_api.model.entities.ProdutoServicoEntity;
import com.petland.petland_api.repository.ProdutoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosServicosController {

    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    @GetMapping()
    public List<ProdutoServicoEntity> listar(){
        return produtoServicoRepository.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody ProdutoServicoEntity requisicao){

        produtoServicoRepository.save(requisicao);
        return requisicao.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id, @RequestBody ProdutoServicoEntity requisicao){

        produtoServicoRepository.save(requisicao);
        return requisicao.getId();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable("id") Integer id){
        produtoServicoRepository.deleteById(id);

    }

}
