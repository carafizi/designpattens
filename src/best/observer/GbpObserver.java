package best.observer;

public class GbpObserver implements Observer {

    private PriceSubject subject;

    public GbpObserver(PriceSubject subject){
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println("Price in GBP: " + subject.getCzkPrice() * 36);
    }
}
