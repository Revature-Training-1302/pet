package com.revature.service;

import com.revature.entity.Person;
import com.revature.entity.Pet;
import com.revature.repository.PersonRepository;
import com.revature.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PetRepository petRepository;

    public Person register(Person person) {
        personRepository.save(person);
        return person;
    }

    public Person login(Person person) {
        Person personDB = personRepository.findById(person.getId()).get();
        if(person.getPassword().equals(personDB.getPassword())) return personDB;
        else return null;
    }

    public Person adopt(Long personId, Long petId) {
        Pet adoptedPet = petRepository.findById(petId).get();
        Person person = personRepository.findById(personId).get();
        person.adopt(adoptedPet);
        personRepository.save(person);
        return person;
    }

    public List<Pet> getAdopted(Long personId) {
        Person person = personRepository.findById(personId).get();
        return person.getPets();
    }
}
