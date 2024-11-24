package com.delsocorro.fight.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delsocorro.fight.model.CombatFighter;


@RestController
public class FighterController {

    @GetMapping("/Ali")
    public ResponseEntity<CombatFighter> getAli() {
         return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .header("sport", "boxing")
                    .header("division", "heavewieght")
                    .header("hall_of_fame", "yes")
                    .body(new CombatFighter(
                                1L,
                                "Muhammad Ali",
                                "The Greatest",
                                "Heavyweight",
                                "Boxing",
                                56,
                                5,
                                0,
                                "Legendary boxer and social activist."
                                ));
    }

    @GetMapping("/fighters")
    public List<CombatFighter> getFighters() {
        return List.of(
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
