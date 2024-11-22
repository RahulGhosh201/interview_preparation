import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        if (soln(n)) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }

    public static boolean soln(int n) {
        int[] arr = new int[n];
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                temp += i;
            }
        }
        if (temp == n)
            return true;
        else
            return false;
    }
}
