package dev.ericds.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsPromotion {

    private String name = "ONE Championship";

    @Autowired
    private Fighter fighter;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Fighter getFighter() {
        return fighter;
    }
    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
    
}
