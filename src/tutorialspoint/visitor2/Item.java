package tutorialspoint.visitor2;

public interface Item {
    public int calculatePrice(ShoppingCartVisitor visitor);
}
