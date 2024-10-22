package lab3.observer.eventsmanagement;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
