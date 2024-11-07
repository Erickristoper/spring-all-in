package proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import model.Technique;

@Component
@Primary
public class PushNotificationTechniqueProxy implements TechniqueNotificationProxy{

    @Override
    public void sendTechnique(Technique t) {
        System.out.println("Sending push notification for technique : " + t.getName());
    }

}
