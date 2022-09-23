package com.example.dog_demo.dto;

import com.example.dog_demo.entity.Owner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data

@Builder

public class DogDTO {


    private Long id;
    private String nickname;
    private String breed;
    private String dateOfBirth;
    private Owner owner;
    private String registrationDate;

}
