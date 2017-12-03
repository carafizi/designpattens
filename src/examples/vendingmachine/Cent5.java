package examples.vendingmachine;

public class Cent5 implements Coin {

    public final static int value = 5;

    @Override
    public int getValue() {
        return this.value;
    }
}
