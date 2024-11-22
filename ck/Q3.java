import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 13, 5, 12, 5, 5, 2, 12, 7, 1 };
        Arrays.sort(a);
        int ans = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > ans) {
                break;
            }
            ans += a[i];
        }
        System.out.println("Ans: " + ans);

    }
}
// 1,2,2,5,5,5,7,12,12,13
