import java.util.*;

abstract class Car {
    abstract public void drive();

    public void sound() {
        System.out.println("It makes some sound.");
    }
}

class Jeep extends Car {
    public void drive() {
        System.out.println("We can drive the car");
    }

    public void turn() {
        System.out.println("We can turn the car");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Jeep car = new Jeep();
        car.drive();
        car.sound();
        car.turn();
    }
}