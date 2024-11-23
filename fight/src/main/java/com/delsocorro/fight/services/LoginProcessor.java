package com.delsocorro.fight.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class LoginProcessor {

    public String login(String username, String password) {
        return ("ERIC".equals(username) && "password".equals(password)? "Logged In" : "Log in failed!" );
    }

}
