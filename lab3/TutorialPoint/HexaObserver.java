package lab3.tutorialpoint;

public class HexaObserver implements Observer {
    private Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("Hex String: " + Integer.toHexString(state).toUpperCase());
    }
}
