package com.example.dog_demo.service.impl;

import com.example.dog_demo.dto.DogDTO;
import com.example.dog_demo.entity.Dog;
import com.example.dog_demo.repository.DogRepository;
import com.example.dog_demo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class DogServiceImpl implements DogService {

    @Autowired
    private DogRepository dogRepository;

    @Override
    public void createDog(DogDTO request) {
        request.setRegistrationDate((new SimpleDateFormat("dd/MM/yy").
                format(new Date())));

        Dog dog = Dog.builder().nickName(request.getNickname())
                .breed(request.getBreed())
                .owner(request.getOwner())
                .dateOfBirth(request.getDateOfBirth())
                .registrationDate(request.getRegistrationDate())
                .build();

        dogRepository.save(dog);
    }

    @Override
    public List<DogDTO> getAllUnregisteredDogs() {
        return null;
    }
}
