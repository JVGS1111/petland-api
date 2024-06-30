package com.petland.petland_api.cadastro.repository;

import com.petland.petland_api.cadastro.model.entities.ProdutoServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer> {
}
