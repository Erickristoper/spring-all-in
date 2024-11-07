package repositories;

import org.springframework.stereotype.Repository;

import model.Technique;

@Repository
public class DBTechniqueRepository implements TechniqueRepository {

    @Override
    public void storeTechnique(Technique t) {
        System.out.println("Storing technique: " + t.getName());
    }

}
