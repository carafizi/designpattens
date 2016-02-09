package patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.getAColor("green");

        AppleAdapter aa = new AppleAdapter(new Orange());
        aa.getAColor("red");
    }
}
