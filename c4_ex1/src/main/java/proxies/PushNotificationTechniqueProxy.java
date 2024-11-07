package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import model.Technique;

@Component
@Qualifier("PUSH")
public class PushNotificationTechniqueProxy implements TechniqueNotificationProxy{

    @Override
    public void sendTechnique(Technique t) {
        System.out.println("Sending push notification for technique : " + t.getName());
    }

}
