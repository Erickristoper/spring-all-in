package main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfiguration;
import model.Category;
import model.Technique;
import services.CategoryService;

public class Main {

  public static void main(String[] args) {

    Category strikingCategory = new Category(
            1L, 
            "Striking", 
            "Techniques involving punches, kicks, and other strikes."
        );


    
    try ( var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
        
        var categoryService = context.getBean(CategoryService.class);

        var returnVal = categoryService.displayCategory(strikingCategory);

        System.out.println(returnVal);

    } catch (BeansException e) {}

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
