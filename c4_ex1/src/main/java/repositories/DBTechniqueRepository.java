package repositories;

import org.springframework.stereotype.Component;

import model.Technique;

@Component
public class DBTechniqueRepository implements TechniqueRepository {

    @Override
    public void storeTechnique(Technique t) {
        System.out.println("Storing technique: " + t.getName());
    }

}
