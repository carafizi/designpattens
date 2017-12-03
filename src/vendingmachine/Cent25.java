package vendingmachine;

public class Cent25 implements Coin {

    public final static int value = 25;

    @Override
    public int getValue() {
        return this.value;
    }
}
