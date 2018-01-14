package test.inheritance;

abstract class Animal {
    abstract void eat();
    void look(){
        System.out.println("Animal looks");
    }
}

abstract class Canine extends Animal {
    abstract void makeNoise();
}

class Dog extends Canine implements Toy {

    @Override
    void makeNoise() {
        System.out.println("Dog barks");
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void play() {
        System.out.println("Dog toy is playing");
    }
}



public class PolymorphysmDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.eat();
        ((Canine)dog).makeNoise();

        ((Dog)dog).play();
    }
}
