package com.petland.petland_api.cadastro.repository;

import com.petland.petland_api.cadastro.model.entities.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalEntity,Integer> {
}
