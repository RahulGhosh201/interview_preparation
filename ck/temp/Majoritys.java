import java.util.*;

public class Majoritys {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        String s = "abaac";
        System.out.println(soln1(arr) + " " + soln2(s));
    }

    public static int soln1(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int c : arr) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int n = arr.length;
        for (int i : arr) {
            if (freq.get(i) > n / 2) {
                return i;
            }
        }
        return -1;
    }

    public static char soln2(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int n = s.toCharArray().length;
        for (char c : s.toCharArray()) {
            if (freq.get(c) > n / 2) {
                return c;
            }
        }
        return '\0';
    }
}