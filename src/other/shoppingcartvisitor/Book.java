package other.shoppingcartvisitor;

public class Book implements Item {

    double price;

    Book(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }


}
