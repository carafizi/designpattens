package shoppingcart.visitor;

public interface Item {
    double accept(ShoppingCartVisitor visitor);
}
