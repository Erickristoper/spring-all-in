package services;


import org.springframework.beans.factory.annotation.Autowired;

import model.Category;
import repositories.TechniqueRepository;

public class CategoryService {

    @Autowired
    TechniqueRepository techniqueRepository;

    public CategoryService(TechniqueRepository techniqueRepository) {
       this.techniqueRepository = techniqueRepository;
    }

    public String displayCategory(Category category) {
        System.out.println("Displaying Category: " + category.getName());
        return "SUCCESS";
    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
