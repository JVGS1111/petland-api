package com.petland.petland_api.service;

import com.petland.petland_api.model.dto.AnimalRequest;
import com.petland.petland_api.model.dto.AnimalResponse;
import com.petland.petland_api.model.entities.AnimalEntity;
import com.petland.petland_api.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public List<AnimalResponse> listar(){
        List<AnimalEntity> entities = repository.findAll();
        List<AnimalResponse> response = new ArrayList<>();
        for (AnimalEntity entity : entities) {
            AnimalResponse newAnimal = new AnimalResponse();
            BeanUtils.copyProperties(entity,newAnimal);
            response.add(newAnimal);
        }
        return response;
    }

    public Integer gravar(AnimalRequest animalRequest){
        AnimalEntity entity = new AnimalEntity();
        BeanUtils.copyProperties(animalRequest,entity);
        repository.save(entity);
        return entity.getId();
    }

    public AnimalResponse editar(Integer id,AnimalRequest request){
        AnimalEntity entity = repository.findById(id).orElse(null);

        if(entity != null){
            BeanUtils.copyProperties(request, entity);
            repository.save(entity);
            AnimalResponse animalResponse = new AnimalResponse();
            BeanUtils.copyProperties(entity,animalResponse);
            return animalResponse;
        }

        return null;
    }

    public boolean deletar(Integer id){
        AnimalEntity entity = repository.findById(id).orElse(null);
        if(entity != null){
            repository.deleteById(id);
            return true;
        }

        return false;
    }

}
