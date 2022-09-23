package com.example.dog_demo.service.impl;

import com.example.dog_demo.dto.DogDTO;
import com.example.dog_demo.dto.OwnerDTO;
import com.example.dog_demo.entity.Dog;
import com.example.dog_demo.entity.Owner;
import com.example.dog_demo.repository.DogRepository;
import com.example.dog_demo.repository.OwnerRepository;
import com.example.dog_demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;


@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private DogRepository dogRepository;

    @Override
    public void createOwner(OwnerDTO request) {

        Owner owner = Owner.builder().firstName(request.getFirstName())
                .lastName(request.getLastName())
                .dateOfBirth(request.getDateOfBirth())
                .build();


            ownerRepository.save(owner);

    }

    @Override
    public OwnerDTO getOwnerById(Long id) {
        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        // finds dogs by owner id ->
        // List<Dog> dogs = dogRepository.findAllById(id)
        //convert to list od dogDTO
        //dogs.stream.map(dog-> DogDTO.builder...


        return   ownerRepository
                .findById(id)
                .map(this::convertToDTO)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

    private  OwnerDTO convertToDTO (Owner owner) {

        return  OwnerDTO.builder().firstName(owner.getFirstName()).
                lastName(owner.getLastName()).
                dateOfBirth(owner.getDateOfBirth())
                .build();
    }

    @Override//toggleDog
    public void addDog(Long id, Long dogId) {
        Owner owner = ownerRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        Dog dog = dogRepository.findById(dogId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (dog.getOwner() != null && !dog.getOwner().getId().equals(id)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }

        dog.setOwner(
                dog.getOwner() == null ? owner : null
        );

        dog.setRegistrationDate(
                dog.getOwner() == null ? String.valueOf(LocalDate.now()) : null
        );

        dogRepository.save(dog);
        List<Dog> dogs = owner.getDogs();
        dogs.add(dog);
        owner.setDogs(dogs);
        ownerRepository.save(owner);

    }
}
