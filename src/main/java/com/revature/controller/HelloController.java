package com.revature.controller;

import com.revature.entity.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public Pet hello() {
        return new Pet(1l,"Updated Ashes", "hello", "hello");
    }
}
