package com.delsocorro.fight.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delsocorro.fight.model.Technique;
import com.delsocorro.fight.repository.TechniqueRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TeknikController {

    private final TechniqueRepository tr;

    public TeknikController(TechniqueRepository tr) {
        this.tr = tr;
    }

    @PostMapping("/teknik")
    public void addToDbTechnique(@RequestBody Technique t) {
        tr.addTechnique(t);
    }

    @GetMapping("/teknik")
    public List<Technique> findTechniques()  { return tr.findAllTechniques(); }
}
