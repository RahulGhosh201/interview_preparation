import java.util.*;

class Animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    }
}

public class RunTimePolymorphism{
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.sound();
    }
}