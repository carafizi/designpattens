package examples.vendingmachine;

public class Soda implements Item {

    private final int price = 45;

    @Override
    public int getPrice() {
        return price;
    }
}
