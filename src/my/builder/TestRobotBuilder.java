package my.builder;

public class TestRobotBuilder {

    public static void main(String[] args){

        // Get a RobotBuilder of type OldRobotBuilder
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        // Pass the OldRobotBuilder specification to the engineer
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        // Tell the engineer to make the Robot using the specifications
        // of the OldRobotBuilder class
        robotEngineer.makeRobot();

        // The engineer returns the right robot based off of the spec
        // sent to it on line 11
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Old Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());


        RobotBuilder newStyleRobotBuilder = new NewRobotBuilder();
        RobotEngineer robotEngineerNew = new RobotEngineer(newStyleRobotBuilder);
        robotEngineerNew.makeRobot();
        Robot newRobot = robotEngineerNew.getRobot();

        System.out.println("New Robot Built");
        System.out.println("Robot Head Type: " + newRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + newRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + newRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + newRobot.getRobotLegs());
    }
}
