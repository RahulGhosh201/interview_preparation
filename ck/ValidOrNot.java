import java.util.*;

public class ValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isValid(s)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        sc.close();
    }

    public static boolean isValid(String s) {
        if (s.length() < 8 || s.length() > 30)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)) || s.charAt(i) == '_')) {
                return false;
            }
        }
        return true;
    }
}