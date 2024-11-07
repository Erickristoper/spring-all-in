package services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Technique;
import proxies.TechniqueNotificationProxy;
import repositories.TechniqueRepository;

@Service
public class TechniqueService {

    private final TechniqueRepository techniqueRepository;
    private final TechniqueNotificationProxy techniqueNotificationProxy;

    public TechniqueService(TechniqueRepository techniqueRepository, @Qualifier("PUSH") TechniqueNotificationProxy techniqueNotificationProxy) {
        this.techniqueRepository = techniqueRepository;
        this.techniqueNotificationProxy = techniqueNotificationProxy;
    }

    public void publishTechnique(Technique t) {
        techniqueRepository.storeTechnique(t);
        techniqueNotificationProxy.sendTechnique(t);
    }
}
