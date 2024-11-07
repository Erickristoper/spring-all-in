package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import model.Technique;

@Component
@Qualifier("EMAIL")
public class EmailTechniqueNotificationProxy implements TechniqueNotificationProxy {

    @Override
    public void sendTechnique(Technique t) {
        System.out.println("Sending notification via email for new Technique " + t.getName());
    }

}
