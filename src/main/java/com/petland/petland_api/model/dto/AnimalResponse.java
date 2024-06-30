package com.petland.petland_api.model.dto;


import com.petland.petland_api.model.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalResponse extends AnimalRequest {
    private Integer id;

}
