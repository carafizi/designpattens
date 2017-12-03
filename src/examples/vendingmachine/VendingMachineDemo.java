package examples.vendingmachine;

import java.util.List;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addItem(new Candy());
        vendingMachine.addItem(new Candy());
        vendingMachine.addItem(new Pepsi());
        vendingMachine.addItem(new Pepsi());

        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent5());
        vendingMachine.addCoin(new Cent5());
        vendingMachine.addCoin(new Cent5());
        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent1());
        vendingMachine.addCoin(new Cent25());

        vendingMachine.insertCoinToTray(new Cent25());

        System.out.println ("Tray total value = " + vendingMachine.getTrayValue());

        List<Coin> change = vendingMachine.buyItem(Candy.class);

        System.out.println("Change returned = " + change);
    }
}
