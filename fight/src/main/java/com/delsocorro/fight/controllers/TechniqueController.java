package com.delsocorro.fight.controllers;

import java.net.Authenticator.RequestorType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.delsocorro.fight.model.Technique;
import com.delsocorro.fight.services.TechniqueService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TechniqueController {

    private final TechniqueService ts;

    public TechniqueController(TechniqueService ts) {
        this.ts = ts;

        Technique technique1 = new Technique(
            "1L",
            "Jab",
            "A quick straight punch.",
            "Striking",
            "boxing,punching",
            "(link unavailable)",
            "(link unavailable)");
        this.ts.addTechnique(technique1);
    }


    @GetMapping("/techniques")
    public String technique(Model model) {
        var techniques = ts.findAll();
        model.addAttribute("techniques", techniques);
        return "technique.html";
    }

    @PostMapping("/techniques")
    public String addTechnique(@RequestParam String name, @RequestParam String description,Model model) {
        
        var technique2 = new Technique(
            "2L",
            name , // "Cross",
            description, // "A powerful straight punch.",
            "Striking",
            "boxing,punching/powerful",
            "(link unavailable)",
            "(link unavailable)");

        ts.addTechnique(technique2);
    
        Technique technique3 = new Technique(
            "3L",
            "Hook",
            "A curved punch targeting the head or body.",
            "Striking",
            "boxing,punching/curved",
            "(link unavailable)",
            "(link unavailable)");
    
        Technique technique4 = new Technique(
            "4L",
            "Uppercut",
            "A punch targeting the opponent's chin or body.",
            "Striking",
            "boxing,punching/uppercut",
            "(link unavailable)",
            "(link unavailable)");
    
            var techniques = ts.findAll();
            model.addAttribute("techniques", techniques);
            
        return "technique.html";
    }
    
    

}
