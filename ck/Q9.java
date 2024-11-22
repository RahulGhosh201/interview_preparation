import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 2, 3, 2, 2 };
        System.out.println("Ans: " + soln(a));
    }

    public static int soln(int[] a) {

        int[] cnt = new int[1001];// assuming the range of elements in the array is 1 to 1000
        for (int i = 0; i < a.length; i++) {
            cnt[a[i]]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (cnt[a[i]] > a.length / 2) {
                return a[i];
            }
        }
        return -1;
    }
}