package other.shoppingcartvisitor;

public interface Item {
    double accept(ShoppingCartVisitor visitor);
}
