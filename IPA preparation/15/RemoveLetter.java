import java.util.*;

public class RemoveLetter {
    public static void main(String[] args) {
        String s = "Arijit";
        char c = 'i';
        System.out.println("unique: " + soln(s, c));
    }

    public static String soln(String s, char c) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
