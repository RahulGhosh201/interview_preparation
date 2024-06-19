import java.util.*;

class Sample {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.setAge(24);
        System.out.println(sample.getAge());
        sample.setName("Rahul");
        System.out.println(sample.getName());
    }
}