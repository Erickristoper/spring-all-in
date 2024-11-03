package dev.ericds.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.ericds.beans.Fighter;
import dev.ericds.beans.SportsPromotion;

@Configuration
public class ProjectConfig {

    @Bean
    public Fighter fighter1() {
        Fighter f = new Fighter();
        f.setName("Tawanchai");
        f.setDivision("FEATHERWIEGHT MUAYTHAI");
        return f;
    }

    @Bean
    public Fighter fighter2() {
        Fighter f = new Fighter();
        f.setName("Superbon");
        f.setDivision("LIGHTWEIGHT MMA");
        return f;
    }

    // param injection for more that one bean
    @Bean
    public SportsPromotion sportsPromotion(@Qualifier("fighter2") Fighter fighter) {
        SportsPromotion sp = new SportsPromotion();
        sp.setName("ONE Championship");
        sp.setFighter(fighter);
        return sp;
    }
}
