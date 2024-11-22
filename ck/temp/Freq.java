import java.util.*;

public class Freq {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1 };
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(soln(s));
    }

    public static char soln(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (freq.get(c) > s.length() / 2) {
                return c;
            }
        }

        return null;
    }
}
