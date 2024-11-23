package com.delsocorro.fight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TechniqueAPI {

    @GetMapping("/technique")
    @ResponseBody
    public String technique() {
        return "Jab";
    }
    
}
