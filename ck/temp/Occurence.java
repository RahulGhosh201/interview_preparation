import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        String s = "Hello World";
        soln(s);
    }

    public static void soln(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + ": " + freq.get(ch[i]));
        }
    }
}