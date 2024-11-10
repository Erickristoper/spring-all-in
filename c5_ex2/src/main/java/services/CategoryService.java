package services;


import org.springframework.beans.factory.annotation.Autowired;

import repositories.TechniqueRepository;

public class CategoryService {

    @Autowired
    TechniqueRepository techniqueRepository;

    public CategoryService(TechniqueRepository techniqueRepository) {
       this.techniqueRepository = techniqueRepository;
    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
