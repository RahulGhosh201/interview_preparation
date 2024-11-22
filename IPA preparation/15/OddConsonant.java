import java.util.*;

public class OddConsonant {
    public static void main(String[] args) {
        System.out.println("Enter str: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2 != 0) && isConsonant(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }

    public static boolean isConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return false;
        }
        return true;
    }
}