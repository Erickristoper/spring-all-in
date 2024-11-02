package dev.ericds.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dev.ericds.beans")
public class ProjectConfig {
}
