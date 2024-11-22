import java.util.*;

public class Fibonacci {

    public static void fibonacci(int n) {
        // if (n > 2) {
        // System.out.print(0 + " " + 1 + " ");
        // }
        System.out.print(0 + " ");
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            System.out.print(b + " ");
            a = b;
            b = temp;
        }

    }

    public static void main(String[] args) {
        int n = 20;
        fibonacci(n);
    }
}
