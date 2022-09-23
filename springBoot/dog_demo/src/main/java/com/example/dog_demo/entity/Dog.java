package com.example.dog_demo.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "dog")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


@Builder
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dog_id", nullable = false)
    private Long id;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "breed")
    private String breed;
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "date_of_registration")
    private String registrationDate; // is assigned, when owner is assigned with the dog

}
