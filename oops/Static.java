import java.util.*;

class MathFunctions {
    static int add(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println("5+10:" + MathFunctions.add(5, 10));
        System.out.println("5*10: " + MathFunctions.mul(5, 10));
    }
}
