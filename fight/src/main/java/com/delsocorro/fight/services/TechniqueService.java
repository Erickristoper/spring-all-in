package com.delsocorro.fight.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.delsocorro.fight.model.Technique;


@Service
public class TechniqueService {
    private List<Technique> techniques = new ArrayList<>();

    public void addTechnique(Technique t) {
        techniques.add(t);
    }

    public List<Technique> findAll() {
        return techniques;
    }
}
