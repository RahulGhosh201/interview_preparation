import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
