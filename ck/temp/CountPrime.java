import java.util.*;

public class CountPrime {
    public static void main(String[] args) {
        String s = "254786135";
        System.out.println("Ans: " + soln(s));
    }

    public static int soln(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isPrime(s.charAt(i) - '0')) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
