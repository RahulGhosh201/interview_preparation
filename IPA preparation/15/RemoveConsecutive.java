import java.util.*;

public class RemoveConsecutive {
    public static void main(String[] args) {
        String s = "aabbcccdee";
        System.out.println("unique: " + soln(s));
    }

    public static String soln(String s) {
        String str = "";
        char ch = '\0';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                ch = s.charAt(i);
                str += ch;
            }
        }
        return str;
    }

}
