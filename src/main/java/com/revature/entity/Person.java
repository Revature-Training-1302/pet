package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    @OneToMany(targetEntity = Pet.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_fk", referencedColumnName = "id")
    private List<Pet> pets;

    public Person() {
        this.pets = new ArrayList<>();
    }

    public void adopt(Pet pet) {
        this.pets.add(pet);
    }

}
