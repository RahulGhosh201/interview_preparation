import java.util.*;

public class RepeatedSum {
    public static void main(String[] args) {
        int n = 195;
        int s = sum(n);
        if (s <= 9) {
            System.out.println(n);
        } else {
            int su = sum(n);
            System.out.println(su);
        }
    }

    public static int sum(int n) {
        int div = n;
        int ans = 0;
        while (div > 0) {
            int rem = div % 10;
            ans += rem;
            div /= 10;
        }
        if (ans > 9) {
            return sum(ans);
        }
        return ans;
    }
}