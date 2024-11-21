package com.delsocorro.fight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

    @RequestMapping("/home/{name}/{color}")
    public String home(@PathVariable String name, @PathVariable String color, Model page) {
        page.addAttribute("username", name);
        page.addAttribute("attack", "left elbow");
        page.addAttribute("color", color);
        return "homez.html";
    }

    
    
}
