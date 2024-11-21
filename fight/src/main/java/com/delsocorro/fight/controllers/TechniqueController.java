package com.delsocorro.fight.controllers;

import java.net.Authenticator.RequestorType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delsocorro.fight.model.Technique;
import com.delsocorro.fight.services.TechniqueService;


@Controller
public class TechniqueController {

    private final TechniqueService ts;

    public TechniqueController(TechniqueService ts) {
        this.ts = ts;

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


    @RequestMapping(path="/techniques", method=RequestMethod.GET)
    public String technique(Model model) {
        var techniques = ts.findAll();
        model.addAttribute("techniques", techniques);
        return "technique.html";
    }


    

}
