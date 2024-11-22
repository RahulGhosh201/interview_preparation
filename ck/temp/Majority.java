import java.util.*;

public class Majority {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 2, 2 };
        System.out.println("Ans: " + soln(arr));
        String s = "aaabc";
        System.out.println("Ans: " + solns(s));
    }

    public static int soln(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        max = Math.max(max, n);
        int[] cnt = new int[max];
        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
        }
        for (int i = 0; i < max; i++) {
            if (cnt[arr[i]] > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static char solns(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int n = s.length();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : freq.keySet()) {
            if (freq.get(c) > n / 2) {
                return c;
            }
        }
        return '\0';
    }
}