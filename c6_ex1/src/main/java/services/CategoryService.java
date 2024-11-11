package services;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import model.Category;
import repositories.TechniqueRepository;

public class CategoryService {

    @Autowired
    TechniqueRepository techniqueRepository;

    private Logger logger = Logger.getLogger(CategoryService.class.getName());

    public CategoryService(TechniqueRepository techniqueRepository) {
       this.techniqueRepository = techniqueRepository;
    }

    public void displayCategory(Category category) {
        logger.info("Displaying Category: " + category.getName());
    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
