import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        soln(arr);
        System.out.println("Ans: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void soln(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((i + 1) * (i + 2)) / 2;
        }
    }
}