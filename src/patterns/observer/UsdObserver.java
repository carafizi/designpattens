package patterns.observer;

public class UsdObserver implements Observer {

    private PriceSubject subject;

    public UsdObserver(PriceSubject subject){
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        System.out.println("Price in USD: " + subject.getCzkPrice() * 23);
    }
}
