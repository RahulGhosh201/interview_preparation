import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "Arijit";
        System.out.println("unique: " + soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) != -1) {
                ans += ch;
            }
        }
        return ans;
    }
}
