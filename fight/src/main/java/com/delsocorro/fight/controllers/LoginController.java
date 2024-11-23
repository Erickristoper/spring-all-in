package com.delsocorro.fight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.delsocorro.fight.services.LoginProcessor;



@Controller
public class LoginController {


    LoginProcessor p;

    LoginController(LoginProcessor p) {
        this.p = p;
    }

    @PostMapping("/")
    public String postMethodName(@RequestParam String username, @RequestParam String password, Model m) {
        
       String statusOfLogIn = p.login(username, password);

        m.addAttribute("message",statusOfLogIn);
        
        return "login.html";
    }

    @GetMapping("/")
    public String getMethodName() {
        return "login.html";
    }
    
    
}
