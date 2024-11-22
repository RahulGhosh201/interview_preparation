import java.util.*;

public class RepeatString {
    public static void main(String[] args) {
        String s = "Hello@123World456";
        System.out.println(soln(s));
    }

    public static String soln(String s) {
        String[] str = s.split("[H14W\\s,@]+");
        String ans = "";
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i].charAt(0))) {
                cnt += (i + 1);
            }
        }
        for (int i = 0; i < cnt; i++) {
            ans += s;
        }
        return ans;
    }
}
// Hello@123World456