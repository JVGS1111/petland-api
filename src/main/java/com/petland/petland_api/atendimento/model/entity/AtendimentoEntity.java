package com.petland.petland_api.atendimento.model.entity;


import com.petland.petland_api.atendimento.model.AtendimentoStatus;
import com.petland.petland_api.atendimento.model.AtendimentoTipo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tab_atendimento")
@Data
public class AtendimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergencia;

    @Enumerated(EnumType.STRING)
    private AtendimentoTipo tipo;

    @Enumerated(EnumType.STRING)
    private AtendimentoStatus status;

    @Column(name = "pet_id")
    private Integer animal;
    @Column(name = "prod_serv_id")
    private Integer produtoServico;
    @Column(name = "cad_id")
    private Integer cadastro;

}
