package examples.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Item> items = new ArrayList<>();
    private List<Coin> coins = new ArrayList<>();
    private List<Coin> tray = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void addCoin(Coin coin){
        this.coins.add(coin);
    }

    public void insertCoinToTray(Coin coin){
        this.tray.add(coin);
    }

    public int getTrayValue(){
        int value = 0;
        for(Coin coin : this.tray){
            value = value + coin.getValue();
        }
        return value;
    }

    private boolean hasCoin(int value){
        for(Coin cn :coins){
            if (cn.getValue() == value){
                return true;
            }
        }
        return false;
    }

    private boolean hasItem(Class clazz){
        for (Item item : items){
            if (item.getClass() == clazz){
               return true;
            }
        }
        return false;
    }

    private Coin withdrawCoin(int value){
        for (Coin coin : coins){
            if (coin.getValue() == value){
                coins.remove(coin);
                return coin;
            }
        }
        return null;
    }

    private Item withdrawItem(Class clazz){
        for(Item item : items){
            if (item.getClass() == clazz){
                items.remove(item);
                return item;
            }
        }
        return null;
    }

    private Item getItem(Class clazz){
        for(Item item : items){
            if (item.getClass() == clazz){
                return item;
            }
        }
        throw new RuntimeException("Item not found");
    }

    List<Coin> getChange(int valueToReturn){
        List<Coin> coinsToReturn = new ArrayList<>();
        if(valueToReturn > 0){
            long balance = valueToReturn;
            while(balance > 0){
                if(balance >= Cent50.value && hasCoin(Cent50.value)){
                    Coin wcoin = withdrawCoin(Cent50.value);
                    coinsToReturn.add(wcoin);
                    balance = balance - Cent50.value;
                    continue;

                }else if(balance >= Cent25.value && hasCoin(Cent25.value)){
                    Coin wcoin = withdrawCoin(Cent25.value);
                    coinsToReturn.add(wcoin);
                    balance = balance - Cent25.value;
                    continue;

                }else if(balance >= Cent5.value && hasCoin(Cent5.value)){
                    Coin wcoin = withdrawCoin(Cent5.value);
                    coinsToReturn.add(wcoin);
                    balance = balance - Cent5.value;
                    continue;

                }else if(balance >= Cent1.value && hasCoin(Cent1.value)){
                    Coin wcoin = withdrawCoin(Cent1.value);
                    coinsToReturn.add(wcoin);
                    balance = balance - Cent1.value;
                    continue;

                }else{
                    throw new RuntimeException("NotSufficientChange, Please try another product");
                }
            }
        }
        coinsToReturn.add(new Cent1());
        return coinsToReturn;
    }

    public List<Coin> buyItem(Class clazz){

        Item item = getItem(clazz);

        if(item.getPrice() == getTrayValue()){
            this.items.remove(item);
            this.coins.addAll(tray);
            return getChange(getTrayValue() - item.getPrice());
        } else if (item.getPrice() < getTrayValue()){
            this.items.remove(item);
            this.coins.addAll(tray);
            return  getChange(getTrayValue() - item.getPrice());
        } else {
            throw new RuntimeException("Not sufficient funds");
        }
    }
}
