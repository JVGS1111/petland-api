package com.petland.petland_api.cadastro.controller;

import com.petland.petland_api.cadastro.model.dto.AnimalRequest;
import com.petland.petland_api.cadastro.model.dto.AnimalResponse;
import com.petland.petland_api.cadastro.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public List<AnimalResponse> listar(){
        return animalService.listar();
    }

    @PostMapping()
    public Integer gravar(@RequestBody AnimalRequest requisicao){

       return  animalService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public AnimalResponse alterar(@PathVariable("id") Integer id, @RequestBody AnimalRequest requisicao){

        return animalService.editar(id,requisicao);
    }

    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable("id") Integer id){
        return  animalService.deletar(id);

    }
}
