import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        int sp = 600, cp = 500;
        System.out.println("Ans: " + String.format("%.2f", soln(sp, cp)));
    }

    public static double soln(int sp, int cp) {
        double ans = 0.0;
        double profit = ((double) sp - (double) cp) / cp;
        ans = profit * 100;
        return ans;
    }
}