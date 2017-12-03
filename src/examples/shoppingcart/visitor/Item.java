package examples.shoppingcart.visitor;

public interface Item {
    double accept(ShoppingCartVisitor visitor);
}
