package dev.ericds.Muay.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import dev.ericds.Muay.model.Technique;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@FeignClient(name = "techniques",
            url = "${name.service.url}")
public interface TechniqueAPIProxy {

    @PostMapping("/attack")
    Technique createTechnique(
        @RequestHeader String requestId,
        @RequestBody Technique t
    );
}
