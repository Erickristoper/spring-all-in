package main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfiguration;
import model.Technique;
import services.CategoryService;
import services.TechniqueService;

public class Main {

  public static void main(String[] args) {

    var technique1 = new Technique(
        1L,
        "Jab",
        "A quick straight punch.",
        "Striking",
        "boxing,punching",
        "(link unavailable)",
        "(link unavailable)");
    
    try ( var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
        
        var tech1 = context.getBean(TechniqueService.class);
        var tech2 = context.getBean(TechniqueService.class);
        var tech3 = context.getBean(TechniqueService.class);
        System.out.println(tech1 == tech2);

        System.out.println( tech1.getTechniqueRepository() == tech2.getTechniqueRepository());

        System.out.println( tech1.getTechniqueRepository() == tech2.sendToProcessor(technique1));

        System.out.println( tech3.sendToProcessor(technique1) == tech2.sendToProcessor(technique1));


    } catch (BeansException e) {
        e.printStackTrace();
    }


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
