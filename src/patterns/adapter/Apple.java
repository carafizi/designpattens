package patterns.adapter;

public class Apple implements BaseApple{
    public void getAColor(String str) {
        System.out.println("Apple color is: " + str);
    }
}
