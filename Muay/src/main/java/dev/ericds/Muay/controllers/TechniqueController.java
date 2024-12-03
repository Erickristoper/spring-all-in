package dev.ericds.Muay.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.ericds.Muay.clients.AttackProxy;
import dev.ericds.Muay.model.Technique;


@RestController
public class TechniqueController {

    // private final TechniqueAPIProxy prox;

    private final AttackProxy attackProxy;

    public TechniqueController(AttackProxy attackProxy) {
        this.attackProxy = attackProxy;
    }

    @PostMapping("/technique")
    public Technique technique(@RequestBody Technique t) {

        String requestId = UUID.randomUUID().toString();
        return attackProxy.createTechnique(requestId, t);
    }
}
