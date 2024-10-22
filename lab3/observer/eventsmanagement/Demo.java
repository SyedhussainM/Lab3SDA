package lab3.observer.eventsmanagement;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EventNotificationListener("admin@example.com"));
        editor.events.subscribe("save", new SMSSupportListener("123-456-7890")); // Add SMS support listener

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
