package patterns.proxy;

public class Demo {

    public static void main(String[] args) {
        Image image = new ProxyImage();

        //image will be loaded from disk
        image.display();

        //image will NOT be loaded from disk
        image.display();

        //image will NOT be loaded from disk again
        image.display();
    }
}
