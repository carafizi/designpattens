package my.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: carafizi
 * Date: 16.02.15
 * Time: 20:54
 */
// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flys.

// Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface Flys {
    String fly();
}

// Class used if the Animal can fly

class ItFlys implements Flys{

    public String fly() {
        return "Flying High";
    }

}

//Class used if the Animal can't fly

class CantFly implements Flys{

    public String fly() {
        return "I can't fly";
    }

}

class FlyAsRocket implements Flys{

    @Override
    public String fly() {
        return "Flying with a rocket";
    }
}
