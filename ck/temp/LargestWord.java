import java.util.*;

public class LargestWord {
    public static void main(String[] args) {
        String s = "I am Rahul Das";
        System.out.println(soln(s));
    }

    public static String soln(String s) {
        String[] str = s.split("[\\s,]+");
        int[] cnt = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            cnt[i] = str[i].length();
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxi) {
                maxi = cnt[i];
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if (maxi == cnt[i]) {
                return str[i];
            }
        }
        return null;
    }
}