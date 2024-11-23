package com.delsocorro.fight.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.delsocorro.fight.services.LoggedIUserManagementService;
import com.delsocorro.fight.services.LoginProcessor;



@Controller
public class LoginController {

    LoginProcessor p;

    @Autowired
    LoggedIUserManagementService ms;

    LoginController(LoginProcessor p) {
        this.p = p;
    }

    @PostMapping("/")
    public String postMethodName(@RequestParam String username, @RequestParam String password, Model m) {
        
        boolean statusOfLogIn = p.login(username, password);

        if(statusOfLogIn) return "redirect:/home";
        else m.addAttribute("message", "Log in failed!");
        
        return "login.html";
    }

    @GetMapping("/")
    public String getMethodName() {
        
        if (null != ms.getUsername()) return "redirect:/home";  

        return "login.html";
    }
    
    
}
