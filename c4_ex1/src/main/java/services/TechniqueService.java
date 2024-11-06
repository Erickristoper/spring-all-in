package services;

import org.springframework.stereotype.Component;

import model.Technique;
import proxies.TechniqueNotificationProxy;
import repositories.TechniqueRepository;

@Component
public class TechniqueService {

    private final TechniqueRepository techniqueRepository;
    private final TechniqueNotificationProxy techniqueNotificationProxy;

    public TechniqueService(TechniqueRepository techniqueRepository, TechniqueNotificationProxy techniqueNotificationProxy) {
        this.techniqueRepository = techniqueRepository;
        this.techniqueNotificationProxy = techniqueNotificationProxy;
    }

    public void publishTechnique(Technique t) {
        techniqueRepository.storeTechnique(t);
        techniqueNotificationProxy.sendTechnique(t);
    }
}
