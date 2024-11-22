import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] str = s.split(" ");
        int count = 0;
        // System.out.println("Ans: " + str.length);
        for (int i = 0; i < str.length; i++) {
            char ch = str[i].charAt(0);
            if (isVowel(ch)) {
                count++;
            }
        }
        System.out.println("Ans: " + count);

    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}