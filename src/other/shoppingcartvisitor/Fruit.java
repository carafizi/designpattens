package other.shoppingcartvisitor;

public class Fruit implements Item {
    private double pricePerKg;
    private double weight;

    Fruit(double pricePerKg, double weight){
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }


    public double getWeight() {
        return weight;
    }


    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
