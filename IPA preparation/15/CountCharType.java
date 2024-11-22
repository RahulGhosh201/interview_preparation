import java.util.*;

public class CountCharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine().toLowerCase();
        int v = 0, c = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (isVowel(s.charAt(i))) {
                    v++;
                } else {
                    c++;
                }
            } else if (Character.isDigit(s.charAt(i))) {
                num++;
            }
        }
        System.out.println("Vowel: " + v);
        System.out.println("Consonant: " + c);
        System.out.println("Number: " + num);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}