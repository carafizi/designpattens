package tutorialspoint.observer;

public class HexaObserver implements Observer {

    private Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
