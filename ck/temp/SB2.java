import java.util.*;

public class SB2 {
    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(soln(prices));
    }

    public static int soln(int[] a) {
        int res = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                res += a[i] - a[i - 1];
            }
        }
        return res;
    }
}