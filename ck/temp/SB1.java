import java.util.*;

public class SB1 {
    public static void main(String[] args) {
        int[] prices = { 7, 10, 1, 3, 6, 9, 2 };
        System.out.println(soln(prices));
    }

    public static int soln(int[] arr) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = Math.max(res, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        return res;
    }

}
// max one transaction allowed