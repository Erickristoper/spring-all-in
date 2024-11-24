package com.delsocorro.fight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delsocorro.fight.model.CombatFighter;


@RestController
public class FighterController {

    @GetMapping("/Ali")
    public CombatFighter getAli() {
         return new CombatFighter(
                                1L,
                                "Muhammad Ali",
                                "The Greatest",
                                "Heavyweight",
                                "Boxing",
                                56,
                                5,
                                0,
                                "Legendary boxer and social activist."
                                );
    }
    
}
