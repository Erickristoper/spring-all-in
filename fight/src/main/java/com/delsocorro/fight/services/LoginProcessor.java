package com.delsocorro.fight.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class LoginProcessor {

    @Autowired
    LoggedIUserManagementService ms;

    @Autowired
    OnlineUserCountService cs;


    public boolean login(String username, String password) {

        if("ERIC".equals(username)  || "june".equals(username) && "password".equals(password)){
            ms.setUsername(username);
            cs.increment();
            return true;
        } else {
            return false ;
        }
    }

}
