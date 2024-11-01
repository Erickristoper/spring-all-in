package dev.ericds;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ericds.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Fighter f1 = context.getBean(Fighter.class);
            System.out.println(f1); 
            System.out.println(f1.getName()); 

        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}