package com.delsocorro.fight.controllers;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delsocorro.fight.exceptions.ErrorDetails;
import com.delsocorro.fight.exceptions.NoFightDrawException;
import com.delsocorro.fight.model.CombatFighter;
import com.delsocorro.fight.model.Technique;
import com.delsocorro.fight.services.FighterService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@RestController
public class FighterController {

    private final FighterService fs;

    private static Logger logger = Logger.getLogger(FighterController.class.getName());


    @PostMapping("/attack")
    public ResponseEntity<Technique> attack(
        @RequestHeader String requestId,
        @RequestBody Technique t
    ) {
        logger.info("Received an attack of ->  " + t.getName() + " with request id of " + requestId);
        t.setId(UUID.randomUUID().toString());

        return ResponseEntity.status(HttpStatus.OK).header("requestId", requestId).body(t);
    }

    public FighterController(FighterService fs) {
        this.fs = fs;
    }


    @PostMapping("/withRequestBody")
    public ResponseEntity<CombatFighter> getFighter( @RequestBody CombatFighter cf) {
        
        logger.info("Received request for " +  cf.getName());

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cf);
    }

    @PostMapping("/checkDrawFightWithControllerAdvice")
    public ResponseEntity<?> chechDrawFigntWithAdvice() {
        CombatFighter c = fs.checkFights();
        return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .body(c);
    }
    

    @PostMapping("/checkDrawFight")
    public ResponseEntity<?> chechDrawFignt(){
       try {
        CombatFighter c = fs.checkFights();
        return ResponseEntity.status(HttpStatus.ACCEPTED)
        .body(c);
       } catch (NoFightDrawException e) {
        ErrorDetails ed = new ErrorDetails();
        ed.setMessage("No draw figths cannot proceed");
        return ResponseEntity.badRequest().body(ed);
       }
    }
    

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
