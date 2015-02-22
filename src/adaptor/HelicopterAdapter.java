package adaptor;


public class HelicopterAdapter implements AirAttacker{

    Helicopter helicopter = new Helicopter();

    @Override
    public void takeOffFromRunway() {
        helicopter.takeOffVertically();
    }

    @Override
    public void landOnRunway() {
         helicopter.landVertically();
    }

    @Override
    public void fireRocket() {
         helicopter.fireMachineGun();
    }
}
