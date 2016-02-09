package patterns.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        PriceSubject subject = new PriceSubject();

        Observer euroObserver = new EuroObserver(subject);
        Observer usdObserver = new UsdObserver(subject);
        Observer gbpObserver = new GbpObserver(subject);



        subject.setCzkPrice(10);

        subject.unregister(gbpObserver);

        System.out.println("------------------");

        subject.setCzkPrice(20);
    }

}
