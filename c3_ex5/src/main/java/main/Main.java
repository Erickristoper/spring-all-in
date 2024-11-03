package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.SportsPromotion;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    SportsPromotion p = context.getBean(SportsPromotion.class);

    System.out.println("Person's name: " + p.getName());
    System.out.println("Person's fighter: " + p.getFighter());
  }
}
