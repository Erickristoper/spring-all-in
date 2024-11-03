package dev.ericds.beans;


public class SportsPromotion {

    private String name = "ONE Championship";

    // Constructor injection
    // private final Fighter fighter;

    // Setter injection
    private Fighter fighter;

    public SportsPromotion() {}
    
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
