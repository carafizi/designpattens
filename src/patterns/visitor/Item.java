package patterns.visitor;

public interface Item {
    public int calculatePrice(ShoppingCartVisitor visitor);
}
