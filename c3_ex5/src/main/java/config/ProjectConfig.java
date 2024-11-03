package config;

import beans.Fighter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

  @Bean
  public Fighter fighter1() {
    Fighter p = new Fighter();
    p.setName("Superlek");
    return p;
  }

  @Bean
  public Fighter fighter2() {
    Fighter p = new Fighter();
    p.setName("Rodtang");
    return p;
  }
}
