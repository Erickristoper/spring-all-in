package com.delsocorro.fight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) {
        page.addAttribute("username", "Tawanchai");
        page.addAttribute("attack", "left elbow");
        page.addAttribute("color", "red");
        return "homez.html";
    }

    @RequestMapping("/requestparam")  // requestparam?name=musemechi
    public String requestParam(@RequestParam String name, @RequestParam(required=false) String color, Model page) {
        page.addAttribute("username", name);
        page.addAttribute("attack", "left elbow");
        page.addAttribute("color", color);
        return "homez.html";
    }
    
    
}
