import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("A: " + soln("A"));
        System.out.println("AB: " + soln("AB"));
    }

    public static int soln(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = c - 'A' + 1;
            ans = ans * 26 + value;
        }
        return ans;
    }
}