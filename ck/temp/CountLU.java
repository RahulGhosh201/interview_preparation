import java.util.*;

public class CountLU {
    public static void main(String[] args) {
        String s = "Rahul Ghosh";
        int l = 0, u = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if (Character.isLowerCase(s.charAt(i))) {
                    l++;
                } else {
                    u++;
                }
            }
        }
        System.out.println("Upper: " + u + " Lower: " + l);
    }
}