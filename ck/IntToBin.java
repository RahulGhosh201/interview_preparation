import java.util.*;

public class IntToBin {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Ans: " + soln(n));
    }

    public static int soln(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n % 2;
            ans = ans * 10 + rem;
            n = n / 2;
        }
        return ans;
    }
}