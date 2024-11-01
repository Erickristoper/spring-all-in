package dev.ericds;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ericds.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Fighter f1 = context.getBean(Fighter.class);
            System.out.println(f1.getName()); 
            
            Fighter f2 = context.getBean("fighter2", Fighter.class);
            System.out.println(f2.getName());   

            Fighter f3 = context.getBean("manny", Fighter.class);
            System.out.println(f3.getName());  

        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}