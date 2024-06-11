import java.util.*;

interface Animal {
    void sound();// abstract method

    default void sleep() {
        System.out.println("Animal sleeps");
    }
}// inside interface we can't define or declare any method using public or
 // private or so, only default and just return type is allowed

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.sound();
    }
}
