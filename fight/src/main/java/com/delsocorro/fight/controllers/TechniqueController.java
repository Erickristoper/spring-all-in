package com.delsocorro.fight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.delsocorro.fight.model.Technique;
import com.delsocorro.fight.repository.TechniqueRepository;
import com.delsocorro.fight.services.TechniqueService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class TechniqueController {

    private final TechniqueService ts;
    private final TechniqueRepository tr;

    public TechniqueController(TechniqueService ts, TechniqueRepository tr) {
        this.ts = ts;
        this.tr = tr;

        Technique technique1 = new Technique(
            1L,
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
            2L,
            name , // "Cross",
            description, // "A powerful straight punch.",
            "Striking",
            "boxing,punching/powerful",
            "(link unavailable)",
            "(link unavailable)");

        ts.addTechnique(technique2);
    
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
    
            var techniques = ts.findAll();
            model.addAttribute("techniques", techniques);
            
        return "technique.html";
    }
    
    

}
