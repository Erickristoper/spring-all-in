package dev.ericds.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsPromotion {

    private String name = "ONE Championship";

    // Constructor injection
    // private final Fighter fighter;

    // Setter injection
    private Fighter fighter;

    @Autowired
    public SportsPromotion(Fighter figther){
        this.fighter = figther;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Fighter getFighter() {
        return fighter;
    }

    @Autowired
    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
    
}
