import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        int n = 17;
        System.out.println("Ans: " + soln(n));
    }

    public static int soln(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n / 10 >= 1) {
                cnt += n / 10;
                n = n % 10;
            } else if (n / 7 >= 1) {
                cnt += n / 7;
                n = n % 7;
            } else if (n / 5 >= 1) {
                cnt += n / 5;
                n = n % 5;
            } else if (n / 1 >= 1) {
                cnt += n / 1;
                n = n % 1;
            }
        }
        return cnt;
    }
}