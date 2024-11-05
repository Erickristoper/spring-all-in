package proxies;

import model.Technique;

public class EmailTechniqueNotificationProxy implements TechniqueNotificationProxy {

    @Override
    public void sendTechnique(Technique t) {
        System.out.println("Sending notification via email for new Technique " + t.getName());
    }

}
