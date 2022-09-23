package com.example.dog_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class OwnerDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private List<DogDTO> dogs;
}
