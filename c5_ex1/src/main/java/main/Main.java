package main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfiguration;
import model.Technique;
import services.TechniqueService;

public class Main {

  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
        var techniqueService1 = context.getBean(TechniqueService.class);
        var techniqueService2 = context.getBean("techniqueService",TechniqueService.class);
        
        System.out.println("are equal? " + (techniqueService1 == techniqueService2));
        
    } catch (BeansException e) {
        e.printStackTrace();
    }

    var technique1 = new Technique(
        1L,
        "Jab",
        "A quick straight punch.",
        "Striking",
        "boxing,punching",
        "(link unavailable)",
        "(link unavailable)");

    var technique2 = new Technique(
        2L,
        "Cross",
        "A powerful straight punch.",
        "Striking",
        "boxing,punching/powerful",
        "(link unavailable)",
        "(link unavailable)");

    Technique technique3 = new Technique(
        3L,
        "Hook",
        "A curved punch targeting the head or body.",
        "Striking",
        "boxing,punching/curved",
        "(link unavailable)",
        "(link unavailable)");

    Technique technique4 = new Technique(
        4L,
        "Uppercut",
        "A punch targeting the opponent's chin or body.",
        "Striking",
        "boxing,punching/uppercut",
        "(link unavailable)",
        "(link unavailable)");

    Technique technique5 = new Technique(
        5L,
        "Roundhouse Kick",
        "A powerful kick targeting the head or body.",
        "Kicking",
        "kickboxing,kicking/roundhouse",
        "(link unavailable)",
        "(link unavailable)");

  }

}