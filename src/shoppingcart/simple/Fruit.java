package shoppingcart.simple;

public class Fruit implements Item {
    private double pricePerKg;
    private double weight;

    Fruit(double pricePerKg, double weight){
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return this.pricePerKg * weight;
    }
}
