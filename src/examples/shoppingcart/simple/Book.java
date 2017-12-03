package examples.shoppingcart.simple;

public class Book implements Item {

    double price;

    Book(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
