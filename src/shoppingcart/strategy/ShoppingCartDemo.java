package shoppingcart.strategy;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Fruit apple  = new Fruit(1,2);
        Fruit orange  = new Fruit(2,2);
        Book book = new Book(20);
        shoppingCart.addItem(apple);
        shoppingCart.addItem(orange);
        shoppingCart.addItem(book);
        shoppingCart.removeItem(book);

        System.out.println(shoppingCart.getTotal());
        PaymentMethod visa = new Visa("myvisa", "12345", "");
        PaymentMethod masterCard = new MasterCard("mymastercard", "56789", "");
        System.out.println(shoppingCart.pay(visa));
        System.out.println(shoppingCart.pay(masterCard));
    }
}
