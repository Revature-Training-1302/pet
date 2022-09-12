package com.revature.controller;

import com.revature.entity.Person;
import com.revature.entity.Pet;
import com.revature.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping
    public Person auth(@RequestBody Person person, @RequestParam(value = "auth", required = false) String authType) {
        if(authType.equals("register")) return personService.register(person);
        else if (authType.equals("login")) return personService.login(person);
        else {
            return null;
        }
    }

    @PatchMapping("/{personId}/pets/{petId}")
    public Person adopt(@PathVariable("personId") Long personId, @PathVariable("petId") Long petId) {
        return personService.adopt(personId, petId);
    }

    @GetMapping("/{id}/pets")
    public List<Pet> getAdopted(@PathVariable("id") Long id) {
        return personService.getAdopted(id);
    }

}
