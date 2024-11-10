package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import model.Technique;
import repositories.TechniqueRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TechniqueProcessor {

    private Technique technique;

    @Autowired
    private final TechniqueRepository techniqueRepository;

    public TechniqueProcessor(TechniqueRepository techniqueRepository) {
        this.techniqueRepository = techniqueRepository;
    }

    public void setTechnique(Technique t) {
        this.technique = t;
    }

    public Technique getTechnique() {
        return technique;
    }
    
    public void processTechnique(){

    }

    public void validateTechnique() {

    }

    public TechniqueRepository getTechniqueRepository() {
        return techniqueRepository;
    }
}
