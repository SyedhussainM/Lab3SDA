package lab3.observer.eventsmanagement;

import java.io.File;

public class EventNotificationListener implements EventListener {
    private String email;

    public EventNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
