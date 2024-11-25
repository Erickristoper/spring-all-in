package com.delsocorro.fight.services;

import org.springframework.stereotype.Service;

import com.delsocorro.fight.exceptions.NoFightDrawException;
import com.delsocorro.fight.model.CombatFighter;

@Service
public class FighterService {

    public CombatFighter checkFights() {
        throw new NoFightDrawException();
    }
}
