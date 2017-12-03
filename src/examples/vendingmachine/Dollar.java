package examples.vendingmachine;

public class Dollar implements Coin {

    private final int value = 100;

    @Override
    public int getValue() {
        return this.value;
    }
}
