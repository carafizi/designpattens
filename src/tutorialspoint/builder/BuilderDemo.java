package tutorialspoint.builder;

/**
 * Created with IntelliJ IDEA.
 * User: carafizi
 * Date: 26.10.15
 * Time: 17:56
 */
public class BuilderDemo {


    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .setWifiEnabled(false)
                .build();
        int i=1;
    }
}
