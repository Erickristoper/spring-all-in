package dev.ericds.Muay.controllers;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import dev.ericds.Muay.model.Technique;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
public class TechniqueAPI {

    Logger log = Logger.getLogger(TechniqueAPI.class.getName());

    @PostMapping("/attack")
    public ResponseEntity<Technique> attack(
        @RequestHeader String requestId,
        @RequestBody Technique t
    ) {
        log.info("Received an attack of ->  " + t.getName() + " with request id of " + requestId);
        t.setId(UUID.randomUUID().toString());

        return ResponseEntity.status(HttpStatus.OK).header("requestId", requestId).body(t);
    }

    @GetMapping("/kumusta")
    public String kumusta() {
        return "Kumusta ka!";
    }

    
}
