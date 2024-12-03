package dev.ericds.Muay.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import dev.ericds.Muay.model.Technique;

@Component
public class TechnicqueRestTemplateProxy implements AttackProxy {

    private final RestTemplate rest;

    @Value("${name.service.url}")
    private String attackServiceUrl;

    public TechnicqueRestTemplateProxy(RestTemplate rest) {
        this.rest = rest;
    }
   
    public Technique createTechnique(String requestId, Technique t) {
        String uri = attackServiceUrl + "/attack";


        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId", requestId);

        HttpEntity<Technique> entity = new HttpEntity<>(t, headers);

        return rest.exchange(uri,
            HttpMethod.POST,
            entity,
            Technique.class)
            .getBody();

    }
}
