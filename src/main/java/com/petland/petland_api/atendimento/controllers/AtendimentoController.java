package com.petland.petland_api.atendimento.controllers;

import com.petland.petland_api.atendimento.model.dto.AtendimentoRequest;
import com.petland.petland_api.atendimento.model.dto.AtendimentoResponse;
import com.petland.petland_api.atendimento.services.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public List<AtendimentoResponse> listar(){

        return atendimentoService.listar();

    }

    @PostMapping
    public Integer cadastrar(@RequestBody AtendimentoRequest atendimentoRequest){
        return atendimentoService.cadastrar(atendimentoRequest);
    }
}
