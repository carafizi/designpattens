package examples.vendingmachine;

public class Nuts implements Item {

    private final int price = 90;

    @Override
    public int getPrice() {
        return price;
    }
}
