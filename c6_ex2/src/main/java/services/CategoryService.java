package services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aspects.ToLog;
import model.Category;
import repositories.TechniqueRepository;

@Service
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

    @ToLog
    public void deleteCategory(Category category) {
        System.out.println("Deleting category " + category.getName());
    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
