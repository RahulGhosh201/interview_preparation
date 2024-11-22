import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
    }

    static String soln(String s) {
        String ans = "";
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                ans += s.charAt(i - 1) + String.valueOf(cnt);
                cnt = 1;
            }
        }
        ans += s.charAt(s.length() - 1) + String.valueOf(cnt);
        return ans;
    }
}