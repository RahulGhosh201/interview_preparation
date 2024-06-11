//Run time polymorphism or method overriding 
class Animal {
    public void sound() {
        System.out.println(("Animal makes a sound"));
    }
}

class Mycat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Mydog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();
        myAnimal = new Mycat();
        myAnimal.sound();
        myAnimal = new Mydog();
        myAnimal.sound();
    }
}