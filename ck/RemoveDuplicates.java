import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = soln(arr);
        System.out.println("Ans: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int soln(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;
        int idx = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}