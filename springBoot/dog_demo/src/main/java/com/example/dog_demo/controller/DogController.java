package com.example.dog_demo.controller;


import com.example.dog_demo.dto.DogDTO;
import com.example.dog_demo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/dog")
public class DogController {

    @Autowired
    private DogService dogService;

    @PostMapping("/dogs")
    public void createDog(@RequestBody DogDTO request) {
        dogService.createDog(request);
    }


}
