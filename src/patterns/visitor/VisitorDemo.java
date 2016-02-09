package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Book(20));
        items.add(new Book(100));
        items.add(new Fruit(15, 10));
        items.add(new Fruit(44, 2));

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(List<Item> items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(Item item : items){
            sum = sum + item.calculatePrice(visitor);
        }
        return sum;
    }
}
