package com.petland.petland_api.repository;

import com.petland.petland_api.model.entities.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalEntity,Integer> {
}
