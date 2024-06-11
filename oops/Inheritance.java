//Inheritance properties
class Animal {
    Animal() {// constructor, as you can see it has the name as the class and it does not need
              // a return type
        System.out.println("Animal is created");
    }

    public void eat() {
        System.out.println("This animal eats food");
    }

}

class Dog extends Animal {

    Dog() {
        super();// calls the constructor of Animal
        System.out.println("Dog is Created");
    }

    public void bark() {
        System.out.println("The dog barks");
    }

    public void eat() {
        super.eat();// calling the superclass method
        System.out.println("The dog eats food");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}