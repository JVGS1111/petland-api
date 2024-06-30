package com.petland.petland_api.repository;

import com.petland.petland_api.model.entities.ProdutoServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer> {
}
