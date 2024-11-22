import java.util.*;

public class RemoveZeroes {
    public static void main(String[] args) {
        String s = "000012356090";
        System.out.println("Ans: " + soln(s));
    }

    public static String soln(String s) {
        int idx = 0;
        while (idx < s.length() && s.charAt(idx) == '0') {
            idx++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = idx; i < s.length(); i++) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}