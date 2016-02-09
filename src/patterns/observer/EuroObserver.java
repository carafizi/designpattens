package patterns.observer;


public class EuroObserver implements Observer {

    private PriceSubject subject;

    public EuroObserver(PriceSubject subject){
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println("Price in Euro: " + subject.getCzkPrice() * 27);
    }
}
