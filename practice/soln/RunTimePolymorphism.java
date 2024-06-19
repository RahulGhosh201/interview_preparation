class Animal {
    public void soln() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void soln() {
        System.out.println("Dog barks");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.soln();
        Animal animal = new Animal();
        animal.soln();

    }
}