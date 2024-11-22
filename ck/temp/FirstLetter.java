import java.util.*;

public class FirstLetter {
    public static void main(String[] args) {
        String s = "Kalyani Govt. Eng. College";
        System.out.println(soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        String[] str = s.split("[\\s,]+");
        for (int i = 0; i < str.length; i++) {
            ans += str[i].charAt(0);
        }
        return ans;
    }
}