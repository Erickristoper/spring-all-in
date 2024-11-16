package config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import aspects.LoggingAspect;
import aspects.SecurityAspect;
import repositories.DBTechniqueRepository;
import repositories.TechniqueRepository;


@Configuration
@ComponentScan(basePackages = {"services", "proxies", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {
    
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    TechniqueRepository techniqueRepository() {
        return new DBTechniqueRepository();
    }

    @Bean
    LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
}
