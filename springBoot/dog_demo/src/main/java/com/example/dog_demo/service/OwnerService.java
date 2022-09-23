package com.example.dog_demo.service;

import com.example.dog_demo.dto.DogDTO;
import com.example.dog_demo.dto.OwnerDTO;


public interface OwnerService {

    void createOwner (OwnerDTO request);

    OwnerDTO getOwnerById(Long id);

    void addDog(Long id, Long dogId);
}
