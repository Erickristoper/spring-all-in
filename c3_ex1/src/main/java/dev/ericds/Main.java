package dev.ericds;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ericds.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {  
            
            Fighter f = context.getBean(Fighter.class);

            SportsPromotion sp = context.getBean(SportsPromotion.class);

            System.out.println("Fighter: " + f.getName());
            System.out.println("Sports Promotion: " + sp.getName());
            System.out.println("SportsPromotion's fighter: " + sp.getFighter());

        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}