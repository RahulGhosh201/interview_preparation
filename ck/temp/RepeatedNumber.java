import java.util.*;

public class RepeatedNumber {
    public static void main(String[] args) {
        String s = "a2b3c1";
        System.out.println(soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        for (int i = 1; i < s.length(); i += 2) {
            int x = s.charAt(i) - '0';
            for (int j = 0; j < x; j++) {
                ans += s.charAt(i - 1);
            }
        }
        return ans;
    }
}