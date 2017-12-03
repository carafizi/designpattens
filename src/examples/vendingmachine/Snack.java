package examples.vendingmachine;

public class Snack implements Item {

    private final int price = 50;

    @Override
    public int getPrice() {
        return price;
    }
}
