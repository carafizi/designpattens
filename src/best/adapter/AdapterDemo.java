package best.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: carafizi
 * Date: 09.12.15
 * Time: 11:24
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.getAColor("green");


        AppleAdapter aa = new AppleAdapter(new Orange());
        aa.getAColor("red");
    }
}
