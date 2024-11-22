import java.util.*;

public class FindUpper {
    public static void main(String[] args) {
        String s = "The quick Brown Fox jumps over the lazy dog";
        String[] str = s.split("[\\s,]+");
        for (int i = 0; i < str.length; i++) {
            if (soln(str[i])) {
                System.out.println(str[i]);
            }
        }
    }

    public static boolean soln(String s) {
        if (Character.isUpperCase(s.charAt(0))) {
            return true;
        }
        return false;
    }
}