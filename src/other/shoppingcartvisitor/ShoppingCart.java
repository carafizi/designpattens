package other.shoppingcartvisitor;

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
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double sum=0;
        for(Item item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
