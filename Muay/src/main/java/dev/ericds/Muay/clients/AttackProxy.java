package dev.ericds.Muay.clients;

import org.springframework.stereotype.Component;

import dev.ericds.Muay.model.Technique;

public interface AttackProxy {
    public Technique createTechnique(String requestId, Technique t);
}
