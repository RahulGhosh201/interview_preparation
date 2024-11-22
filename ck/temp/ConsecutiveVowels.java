import java.util.*;

public class ConsecutiveVowels {
    public static void main(String[] args) {
        String s = "I aebc spaghetti and meatballs for dinner";
        String[] str = s.split("[\\s,]+");
        System.out.println("Ans: " + soln(str));
    }

    public static int soln(String[] s) {
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length() - 1; j++) {
                if (isVowel(s[i].charAt(j)) && isVowel(s[i].charAt(j + 1))) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}