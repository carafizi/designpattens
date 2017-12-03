package examples.vendingmachine;

public class Cent1 implements Coin {

    public final static int value = 1;

    @Override
    public int getValue() {
        return this.value;
    }
}
