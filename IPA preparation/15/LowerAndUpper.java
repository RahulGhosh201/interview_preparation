import java.util.*;

public class LowerAndUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lower = 0, upper = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                lower++;
            } else if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            }
        }
        System.out.println("Lower: " + lower + " Upper: " + upper);
    }
}
