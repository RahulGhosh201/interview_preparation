import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int[] a = new int[] { 14, 12, 13, 8 };
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (ans > a[i]) {
                ans = a[i];
            }
        }
        System.out.print("Ans: " + ans);
    }
}
