package patterns.proxy;

public class RealImage implements Image {

    public RealImage(){
        System.out.println("Loading real image file in constructor");
    }

    @Override
    public void display() {
        System.out.println("Displaying real image file");
    }

}
