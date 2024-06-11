import java.util.*;

public class BinarySearch {
    public static int soln(int[] arr, int n, int key) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l+(r-l)/2;
            if(arr[m]==key) return m;
            else if(key<arr[m]) r=m-1;
            else l=m+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        int ans = soln(arr, n, key);
        System.out.println("Ans: " + ans);
        sc.close();
    }
}

// Java threads, Normalization,util,collection
