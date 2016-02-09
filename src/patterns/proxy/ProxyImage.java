package patterns.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage();
        }
        realImage.display();
    }
}
