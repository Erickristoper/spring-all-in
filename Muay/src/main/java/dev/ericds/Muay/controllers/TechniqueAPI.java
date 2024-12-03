package dev.ericds.Muay.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.ericds.Muay.clients.TechniqueAPIProxy;
import dev.ericds.Muay.model.Technique;


@RestController
public class TechniqueAPI {

    private final TechniqueAPIProxy prox;

    public TechniqueAPI(TechniqueAPIProxy prox) {
        this.prox = prox;
    }

    @PostMapping("/technique")
    public Technique technique(@RequestBody Technique t) {
        System.out.println("t.getNAme  --> " + t.getName() + "  " + t.getDescription());

        String requestId = UUID.randomUUID().toString();
        return prox.createTechnique(requestId, t);
    }
}
