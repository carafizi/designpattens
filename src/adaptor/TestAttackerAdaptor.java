package adaptor;


public class TestAttackerAdaptor {
    public static void main(String[] args) {

        Plane plane = new Plane();

        Helicopter helicopter = new Helicopter();

        HelicopterAdapter helicopterAdapter = new HelicopterAdapter();

        helicopterAdapter.takeOffFromRunway();
        helicopterAdapter.landOnRunway();
        helicopterAdapter.fireRocket();
    }
}
