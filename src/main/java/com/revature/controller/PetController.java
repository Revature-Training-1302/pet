package com.revature.controller;

import com.revature.entity.Pet;
import com.revature.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    PetService petService;

    @PostMapping()
    public Pet insert(@RequestBody Pet pet) {
        return petService.insert(pet);
    }

    @GetMapping("/{id}")
    public Pet getById(@PathVariable("id") Long id) {
        return petService.getById(id);
    }

    @GetMapping
    public List<Pet> getAll() {
        return petService.getAll();
    }

    @PutMapping
    public Pet update(@RequestBody Pet pet) {
        return petService.update(pet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        petService.delete(id);
    }

}
