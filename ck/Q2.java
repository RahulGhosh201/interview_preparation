import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    // Function to find the longest palindrome in the string
    public static String soln(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand around the center for both odd and even length palindromes
            int len1 = expandAroundCenter(s, i, i); // Odd-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even-length palindrome

            // Get the longer of the two lengths
            int len = Math.max(len1, len2);

            // Update the start and end indices of the longest palindrome
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
    // 2,13,5,12,5,5,2,12,7,1

    // Helper function to expand around the center and return the length of the
    // palindrome
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of the palindrome
    }
}
