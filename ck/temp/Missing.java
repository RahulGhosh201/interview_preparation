import java.util.*;

public class Missing {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 9, 7 };
        int[] ans = soln(arr);
        for (int it : ans) {
            System.out.println(it);
        }
    }

    public static int[] soln(int[] arr) {
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int i = mini; i <= maxi; i++) {
            if (!freq.containsKey(i)) {
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}