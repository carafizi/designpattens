package vendingmachine;

public class Pepsi implements Item {

    private final int price = 35;

    @Override
    public int getPrice() {
        return this.price;
    }
}
