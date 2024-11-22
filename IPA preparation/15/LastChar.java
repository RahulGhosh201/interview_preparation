import java.util.*;

public class LastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && Character.isAlphabetic(s.charAt(i - 1))) {
                ans += s.charAt(i - 1);
            }
        }
        ans += s.charAt(s.length() - 1);
        System.out.println("Ans: " + ans);
    }
}