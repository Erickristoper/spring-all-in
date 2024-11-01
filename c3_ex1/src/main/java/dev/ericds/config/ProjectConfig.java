package dev.ericds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import dev.ericds.Fighter;
import dev.ericds.SportsPromotion;

@Configuration
public class ProjectConfig {

    @Bean
    public Fighter fighter() {
        Fighter f = new Fighter();
        f.setName("Pacio");
        f.setDivision("STARWEIGHT MMA");
        return f;
    }

    @Bean
    public SportsPromotion sportsPromotion() {
        SportsPromotion sp = new SportsPromotion();
        sp.setName("ONE Championship");
        sp.setFighter(fighter()); // Wiring bean using direct method call
        return sp;
    }

    /////////////
    
    @Bean
    @Primary
    public Fighter fighter2() {
        Fighter f = new Fighter();
        f.setName("Andrade");
        f.setDivision("BANTAMWEIGHT MMA");
        return f;
    }

    @Bean
    @Primary
    public SportsPromotion sportsPromotion1(Fighter fighter) {
        SportsPromotion sp = new SportsPromotion();
        sp.setName("ONE Championship");
        sp.setFighter(fighter); // Wiring bean using methods parameter
        return sp;
    }

}
