package patterns.adapter;

interface BaseApple {
    void getAColor(String str);
}

class Apple implements BaseApple {
    public void getAColor(String str) {
        System.out.println("Apple color is: " + str);
    }
}

class Orange {
    void getOColor(String str) {
        System.out.println("Orange color is: " + str);
    }
}

class AppleAdapter implements BaseApple {
    private Orange orange;
    AppleAdapter(Orange orange) {
        this.orange = orange;
    }
    public void getAColor(String str) {
        orange.getOColor(str);
    }
}

public class Adapter {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.getAColor("green");

        AppleAdapter aa = new AppleAdapter(new Orange());
        aa.getAColor("red");
    }
}
