import java.util.*;

public class RemoveConsecutive {
    public static void main(String[] args) {
        String s = "abbcddeff";
        System.out.println("Ans: " + soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == s.charAt(i)) {
                ans += s.charAt(i);
                i++;
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}