package dev.ericds.Muay.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import dev.ericds.Muay.model.Technique;
import reactor.core.publisher.Mono;

@Component
public class TechniqueWebClientProxy {

    private final WebClient wClient;

    @Value("${name.service.url}")
    private String url;

    public TechniqueWebClientProxy(WebClient wClient) {
        this.wClient = wClient;
    }

    public Mono<Technique> createTechnique(
        String requestId,
        Technique t) {
            return wClient.post()
                .uri(url + "/attack")
                .header("requestId" , requestId)
                .body(Mono.just(t), Technique.class)
                .retrieve()
                .bodyToMono(Technique.class);
    }
}
