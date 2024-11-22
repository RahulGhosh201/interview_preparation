import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 4, 1, 5, 3, 6, 2, 7 };
        int key = 6;
        System.out.println("Ans: " + soln(a, key));
    }

    public static int soln(int[] arr, int key) {
        int l = 0, r = arr.length - 1;
        Arrays.sort(arr);
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key) {
                return m;
            } else if (arr[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}