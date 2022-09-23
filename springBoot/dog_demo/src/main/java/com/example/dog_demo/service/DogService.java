package com.example.dog_demo.service;

import com.example.dog_demo.dto.DogDTO;

import java.util.List;

public interface DogService {

    void createDog(DogDTO request);
    List<DogDTO> getAllUnregisteredDogs();
}
