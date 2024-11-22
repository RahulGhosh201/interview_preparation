import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        String s = "Home, Sweet Home";
        String[] str = s.split("[\\s,]+");
        String sr = "Home";
        System.out.println("Ans: " + soln(str, sr));
    }

    public static int soln(String[] str, String sr) {
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (sr.equals(str[i])) {
                cnt++;
            }
        }
        return cnt;
    }
}