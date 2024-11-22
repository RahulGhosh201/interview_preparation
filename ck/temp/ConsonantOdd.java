import java.util.*;

public class ConsonantOdd {
    public static void main(String[] args) {
        String s = "Arijit Ghosh";
        System.out.println("Ans: " + soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                if (isConsonant(s.charAt(i))) {
                    ans += s.charAt(i);
                }
            }
        }
        return ans;
    }

    public static boolean isConsonant(char c) {
        char ch = Character.toLowerCase(c);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return false;
        }
        return true;
    }
}