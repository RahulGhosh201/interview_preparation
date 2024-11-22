import java.util.*;

public class RotateArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        int[] ans = soln(arr, d);
        System.out.println("Ans: ");
        for (int nums : ans) {
            System.out.print(nums + " ");
        }
    }

    public static int[] soln(int[] arr, int d) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        int k = 0;
        for (int i = d; i < n; i++) {
            ans[k++] = arr[i];
        }
        int j = 0;
        while (k < n) {
            ans[k++] = arr[j++];
        }

        return ans;
    }
}
// 1 2 3 4 5 6 7
// 3 4 5 6 7 1 2