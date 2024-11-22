import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str:");
        String s = sc.nextLine().toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                arr[ch - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + arr[i]);
            }

        }

    }
}