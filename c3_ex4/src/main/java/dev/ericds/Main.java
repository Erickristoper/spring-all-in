package dev.ericds;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ericds.beans.SportsPromotion;
import dev.ericds.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {  
            
            SportsPromotion sp = context.getBean(SportsPromotion.class);

            System.out.println("Sports Promotion: " + sp.getName());
            System.out.println("Fighter:  " + sp.getFighter());

        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}