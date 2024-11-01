package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.ericds.Fighter;

@Configuration
public class ProjectConfig {

    @Bean
    Fighter fighter() {
        var f = new Fighter();
        f.setName("Buakaw");
        return f;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
