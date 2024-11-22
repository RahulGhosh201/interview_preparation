import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "My name is Nitin ans I can speak Malayalam";
        String[] str = s.split("[\\s,]+");
        for (int i = 0; i < str.length; i++) {
            if (isPalindrome(str[i])) {
                System.out.println(str[i]);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        // String ans = "";
        // s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}