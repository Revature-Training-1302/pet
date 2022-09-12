package com.revature.service;

import com.revature.entity.Pet;
import com.revature.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;

    public Pet insert(Pet pet) {
        petRepository.save(pet);
        return pet;
    }

    public Pet getById(Long id) {
        return petRepository.findById(id).get();
    }

    public List<Pet> getAll() {
        return petRepository.findAll();
    }

    public Pet update(Pet pet) {
        petRepository.save(pet);
        return pet;
    }

    public void delete(Long id) {
        petRepository.deleteById(id);
    }
}
