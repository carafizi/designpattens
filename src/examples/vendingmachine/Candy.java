package examples.vendingmachine;

public class Candy implements Item {

    private final int price = 10;

    @Override
    public int getPrice() {
        return this.price;
    }
}
