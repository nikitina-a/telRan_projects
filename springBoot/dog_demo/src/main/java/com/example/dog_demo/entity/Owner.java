package com.example.dog_demo.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owner")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


@Builder
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id", nullable = false)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @OneToMany (mappedBy = "owner")
    private List<Dog> dogs;


}
