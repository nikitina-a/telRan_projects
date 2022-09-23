package com.example.dog_demo.controller;


import com.example.dog_demo.dto.DogDTO;
import com.example.dog_demo.dto.OwnerDTO;
import com.example.dog_demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;


    @PostMapping("/owners")
    public void createOwner(@RequestBody OwnerDTO request) {
        ownerService.createOwner(request);
    }

    @GetMapping("/owners/{id}")
    public OwnerDTO getOwnerById(@PathVariable("id") Long ownerId) {
        return ownerService.getOwnerById(ownerId);
    }

    @PutMapping("/owners/{id}/dogs/{dog_id}")
    public void addDogToOwner(@PathVariable("id") Long id, @PathVariable("dog_id") Long dogId) {
        ownerService.addDog(id,dogId);
    }



}
