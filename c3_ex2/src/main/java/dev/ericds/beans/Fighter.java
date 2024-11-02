package dev.ericds.beans;

import org.springframework.stereotype.Component;

@Component
public class Fighter {
    private String name = "Rodtang";

    private String division = "FLYWEIGHT MUAY THAI";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            return name + " (" + division + ")";
        
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    

}
