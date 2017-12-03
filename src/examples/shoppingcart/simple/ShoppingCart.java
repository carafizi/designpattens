package examples.shoppingcart.simple;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();


    void addItem(Item item){
        this.items.add(item);
    }

    void removeItem(Item item){
        this.items.remove(item);
    }

    double getTotal(){
        double total=0;
        for (Item item : this.items){
            total = total + item.getPrice();
        }
        return total;
    }
}
