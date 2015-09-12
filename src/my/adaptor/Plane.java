package my.adaptor;


public class Plane implements AirAttacker {
    @Override
    public void takeOffFromRunway() {
        System.out.println("Taking off runway");
    }

    @Override
    public void landOnRunway() {
        System.out.println("Landng on runway");
    }

    @Override
    public void fireRocket() {
        System.out.println("Fire a rocket");
    }
}
