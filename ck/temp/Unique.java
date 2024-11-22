import java.util.*;

public class Unique {
    public static void main(String[] args) {
        String s = "minimum";
        System.out.println(soln(s));
    }

    public static char soln(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
}