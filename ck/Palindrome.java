import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        if (s.equals(temp)) {
            return true;
        } else {
            return false;
        }
    }
}
