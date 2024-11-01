package dev.ericds;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Fighter {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Tawatchai";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
