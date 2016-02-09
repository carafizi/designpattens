package patterns.visitor;

public class Fruit implements Item {

    private int pricePerKg;
    private int weight;

    public Fruit(int priceKg, int wt){
        this.pricePerKg=priceKg;
        this.weight=wt;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int calculatePrice(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
