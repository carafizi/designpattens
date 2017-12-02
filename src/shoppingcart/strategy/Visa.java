package shoppingcart.strategy;

public class Visa implements PaymentMethod {

    private final String name;
    private final String cardNumber;
    private final String expires;

    public Visa(String name, String cardNumber, String expires) {
        super();
        this.name = name;
        this.cardNumber = cardNumber;
        this.expires = expires;
    }

    @Override
    public boolean pay(double amount) {

        // Open Comms to Visa
        // Verify connection
        // Paybill using these details
        System.out.println("Performing Visa payment of " + amount + "$");
        return true; // if payment goes through
    }

}
