import java.util.*;

public class CharOdd {
    public static void main(String[] args) {
        String s = "Rahul Ghosh";
        System.out.println("Ans: " + soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}