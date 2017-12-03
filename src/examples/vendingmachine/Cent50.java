package examples.vendingmachine;

public class Cent50 implements Coin {

    public final static int value = 50;

    @Override
    public int getValue() {
        return this.value;
    }
}
