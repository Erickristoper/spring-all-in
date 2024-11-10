package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import repositories.TechniqueRepository;

@Service
@Lazy
public class CategoryService {


    public CategoryService(TechniqueRepository techniqueRepository) {
        System.out.println("CategoryService instance is created!");
    }
}
