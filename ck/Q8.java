import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int[] a = { 2, -3, 5, 12, -15, 5, 2, -12, 2, -1 };
        System.out.println("Ans: " + soln(a));
    }

    public static int soln(int[] a) {
        int maxSum = -1, temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
            if (maxSum < temp) {
                temp = maxSum;
            }
            if (temp < 0)
                temp = 0;
        }
        return maxSum;
    }
}
