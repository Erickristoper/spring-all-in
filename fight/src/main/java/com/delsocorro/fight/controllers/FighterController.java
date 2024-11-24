package com.delsocorro.fight.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/fighters")
    public List<CombatFighter> getFighters() {
        return Arrays.asList(
                    new CombatFighter(
                                1L,
                                "Muhammad Ali",
                                "The Greatest",
                                "Heavyweight",
                                "Boxing",
                                56,
                                5,
                                0,
                                "Legendary boxer and social activist."
                                ),
                    new CombatFighter(
                                2L,
                                "Conor McGregor",
                                "The Notorious",
                                "Lightweight",
                                "Mixed Martial Arts",
                                21,
                                6,
                                0,
                                "Started as a boxer and moved to MMA"));
    }
    
    
}
