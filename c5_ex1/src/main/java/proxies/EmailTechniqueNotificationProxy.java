package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Technique;

@Service
@Qualifier("EMAIL")
public class EmailTechniqueNotificationProxy implements TechniqueNotificationProxy {

    @Override
    public void sendTechnique(Technique t) {
        System.out.println("Sending notification via email for new Technique " + t.getName());
    }

}
