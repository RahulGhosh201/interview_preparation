import java.util.*;

class Sample {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("Ans1: " + sample.add(5, 10));
        System.out.println("Ans1: " + sample.add(5, 10, 15));
        System.out.println("Ans1: " + sample.add(5.45f, 10.35f));
    }
}