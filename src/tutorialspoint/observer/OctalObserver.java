package tutorialspoint.observer;

public class OctalObserver implements Observer {

    private Subject subject;

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
