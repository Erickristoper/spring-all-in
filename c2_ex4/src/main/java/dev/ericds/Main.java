package dev.ericds;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ericds.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {  
            
            try (Scanner scanner = new Scanner(System.in)) {
                String division = scanner.nextLine();

                Fighter f1 = new Fighter();
                f1.setName("Rodtang");

                Fighter f2 = new Fighter();
                f2.setName("Superlek");

                if ("MUAYTHAI".equals(division)) {
                    context.registerBean("fighter1", Fighter.class, () -> f1, bc -> bc.setPrimary(true));
                    context.registerBean("fighter2", Fighter.class, () -> f2);  }
                else 
                    context.registerBean("fighter2", Fighter.class, () -> f2);
            }
            
            Fighter worldChamp = context.getBean(Fighter.class);

            System.out.println(worldChamp); 
            System.out.println(worldChamp.getName()); 

        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}