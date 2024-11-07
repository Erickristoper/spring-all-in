package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Technique;

@Service
@Qualifier("PUSH")
public class PushNotificationTechniqueProxy implements TechniqueNotificationProxy{

    @Override
    public void sendTechnique(Technique t) {
        System.out.println("Sending push notification for technique : " + t.getName());
    }

}
