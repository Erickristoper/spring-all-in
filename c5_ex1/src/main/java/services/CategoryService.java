package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.TechniqueRepository;

@Service
public class CategoryService {

    private final TechniqueRepository techniqueRepository;

    public CategoryService(TechniqueRepository techniqueRepository) {
        this.techniqueRepository = techniqueRepository;
    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
