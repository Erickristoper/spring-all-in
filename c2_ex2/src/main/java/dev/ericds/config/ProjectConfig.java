package dev.ericds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import dev.ericds.Fighter;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Fighter fighter1() {
        var f = new Fighter();
        f.setName("Buakaw");
        return f;
    }

    @Bean
    Fighter fighter2() {
        var f = new Fighter();
        f.setName("Superbon");
        return f;
    }

    @Bean(name = "manny")
    Fighter fighter3() {
        var f = new Fighter();
        f.setName("Pacquiao");
        return f;
    }
}
