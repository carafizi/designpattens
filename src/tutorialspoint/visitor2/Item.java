package tutorialspoint.visitor2;

public interface Item {
    public int accept(ShoppingCartVisitor visitor);
}
