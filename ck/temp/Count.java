import java.util.*;

public class Count {
    public static void main(String[] args) {
        String s = "123aEbc";
        soln(s);
    }

    public static void soln(String s) {
        int v = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                d++;
            } else if (Character.isAlphabetic(s.charAt(i))) {
                if (isVowel(s.charAt(i))) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowel:" + v + " Consonant:" + c + " Digit:" + d);
    }

    public static boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}