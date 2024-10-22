package lab3.tutorialpoint;

public class OctalObserver implements Observer {
    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("Octal String: " + Integer.toOctalString(state));
    }
}