package com.delsocorro.fight.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TechniqueAPI {

    @GetMapping("/technique")
    public String technique() {
        return "Jab";
    }

    @GetMapping("/kumusta")
    public String kumusta() {
        return "Kumusta ka!";
    }

    
}
