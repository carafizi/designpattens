package builder;


public class NewRobotBuilder implements RobotBuilder {

    Robot robot;

    public NewRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("TitanHead");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Glass Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Long strong arms");
    }

    @Override
    public void buildRobotLegs() {
         robot.setRobotLegs("Rocket legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
