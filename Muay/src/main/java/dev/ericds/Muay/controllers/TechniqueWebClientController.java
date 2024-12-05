package dev.ericds.Muay.controllers;

import java.util.UUID;

import dev.ericds.Muay.clients.TechniqueWebClientProxy;
import dev.ericds.Muay.model.Technique;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TechniqueWebClientController {

    private final TechniqueWebClientProxy prox;

    public TechniqueWebClientController(TechniqueWebClientProxy prox) {
        this.prox = prox;
    }

    @PostMapping("/attack")
    public Mono<Technique> postMethodName(@RequestBody Technique t) {
        
        String requestID = UUID.randomUUID().toString();
        
        return prox.createTechnique(requestID, t);
    }
    
}
