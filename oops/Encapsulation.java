
//encapsulation
import java.util.*;

class Person {
    // private variables, it can't be accessed from outside the class
    private String name;
    private int age;

    // public getter for name
    public String getName() {
        return name;
    }

    // public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter for age
    public int getAge() {
        return age;
    }

    // public setter for age
    public void setAge(int age) {
        this.age = age;
    }
    // as age and name can't be accessed while being private , these getter and
    // setter are used with the help of this to get access of them
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(24);
        System.out.println("Age: " + person.getAge());
        person.setName("Rahul");
        System.out.println("Name: " + person.getName());
    }
}