import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 6 };
        System.out.println("Ans: " + soln(a));
    }

    public static int soln(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (gcd(a[i], a[j]) == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}