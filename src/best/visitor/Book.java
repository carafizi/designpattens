package best.visitor;

public class Book implements Item {

    private int price;

    public Book(int cost){
        this.price=cost;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int calculatePrice(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
