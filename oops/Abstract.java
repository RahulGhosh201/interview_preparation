import java.util.*;

abstract class Animal {
    public abstract void sound();// abstract method (only declared not defined)

    public void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");// abstract method is defined here in the subclass
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}