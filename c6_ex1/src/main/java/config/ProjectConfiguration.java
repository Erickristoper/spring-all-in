package config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import repositories.DBTechniqueRepository;
import repositories.TechniqueRepository;
import services.CategoryService;


@Configuration
@ComponentScan(basePackages = {"services", "proxies"})
public class ProjectConfiguration {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CategoryService categoryService() {
        return new CategoryService(null);
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public TechniqueRepository techniqueRepository() {
        return new DBTechniqueRepository();
    }
}
