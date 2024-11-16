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

    @ToLog
    public String displayCategory(Category category) {
        System.out.println("Displaying Category: " + category.getName());
        return "SUCCESS";
    }

    
    public void deleteCategory(Category category) {
        System.out.println("Deleting category " + category.getName());
    }

    public String updateCategory(Category c) {
        System.out.println("Updating category " + c.getName());
        return "UPDATE SUCCESSFUL!";
    }

    public String modifyCategory(Category c) {
        System.out.println("Modifying category " + c.getName());
        throw new NumberFormatException();
    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
