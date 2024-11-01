package dev.ericds;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Fighter f = context.getBean(Fighter.class);

        String eow = context.getBean(String.class);
        Integer ten = context.getBean(Integer.class);

        System.out.println(f.getName());
        System.out.println(eow);
        System.out.println(ten);
    }
}