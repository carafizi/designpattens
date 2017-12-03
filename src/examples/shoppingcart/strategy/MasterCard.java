package examples.shoppingcart.strategy;

public class MasterCard implements PaymentMethod {

    private final String name;
    private final String cardNumber;
    private final String expires;

    public MasterCard(String name, String cardNumber, String expires) {
        super();
        this.name = name;
        this.cardNumber = cardNumber;
        this.expires = expires;
    }

    @Override
    public boolean pay(double amount) {

        // Open Comms to Mastercard
        // Verify connection
        // Paybill using these details
        System.out.println("Performing Mastercard payment of " + amount + "$");
        return true; // if payment goes through
    }

}


