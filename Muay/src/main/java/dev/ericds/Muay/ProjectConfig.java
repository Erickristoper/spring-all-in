package dev.ericds.Muay;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "dev.ericds.Muay.clients")
public class ProjectConfig {

}
