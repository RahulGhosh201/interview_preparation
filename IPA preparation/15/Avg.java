import java.util.*;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = sc.nextInt();
        int up = sc.nextInt();
        System.out.println("Ans: " + soln(arr, n, low, up));
        sc.close();
    }

    public static int soln(int[] arr, int n, int low, int up) {
        int ans = 0, sum = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= low && arr[i] <= up) {
                sum += arr[i];
                cnt++;
            }
        }
        ans = sum / cnt;
        return ans;
    }
}
