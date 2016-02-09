package patterns.observer;


import java.util.ArrayList;
import java.util.List;

public class PriceSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private int czkPrice;

    public int getCzkPrice() {
        return czkPrice;
    }

    public void setCzkPrice(int czkPrice) {
        this.czkPrice = czkPrice;
        notifyObservers();
    }

    public void register(Observer observer){
        observers.add(observer);
    }

    public void unregister(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
