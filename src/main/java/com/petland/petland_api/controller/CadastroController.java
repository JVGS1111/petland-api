package com.petland.petland_api.controller;

import com.petland.petland_api.model.dto.CadastroRequest;
import com.petland.petland_api.model.dto.CadastroResponse;
import com.petland.petland_api.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {


    @Autowired
    private CadastroService cadastroService;

    @GetMapping()
    public List<CadastroResponse> listar(){
        return cadastroService.listar();
    }

    @PostMapping()
    public Integer gravar(@RequestBody CadastroRequest requisicao){

        return cadastroService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public CadastroResponse alterar(@PathVariable("id") Integer id, @RequestBody CadastroRequest requisicao){

        return cadastroService.editar(id,requisicao);

    }

    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable("id") Integer id){
        return cadastroService.deletar(id);
    }

}
