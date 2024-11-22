import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        String[] str = s.split("[\\s,]+");
        for (int i = 0; i < str.length; i++) {
            String ch = str[i].toLowerCase();
            if (isPalindrome(ch)) {
                System.out.println(str[i]);
            }
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