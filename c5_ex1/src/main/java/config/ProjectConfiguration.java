package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import services.TechniqueService;

@Configuration
public class ProjectConfiguration {

    @Bean
    public TechniqueService techniqueService() {
        return new TechniqueService(null, null);
    }
}
