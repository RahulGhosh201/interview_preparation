import java.util.*;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void types() {
        System.out.println("There are many animals");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog makes a sound");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.types();
    }
}