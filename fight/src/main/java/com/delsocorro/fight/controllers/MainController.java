package com.delsocorro.fight.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestParam;

import com.delsocorro.fight.services.LoggedIUserManagementService;
import com.delsocorro.fight.services.OnlineUserCountService;

import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class MainController {

    @Autowired
    LoggedIUserManagementService ms;

    @Autowired
    OnlineUserCountService cs;

    @GetMapping("/home")
    public String home(@RequestParam(required = false) String logout, Model model) {
        if (null != logout) ms.setUsername(null);

        if(ms.getUsername() == null) return "redirect:/";

        model.addAttribute("username", ms.getUsername());
        model.addAttribute("noOfUser", cs.getCount());
        return "homez.html";
    }

}
