import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        int[] arr = { 100, 250, 300, 100, 25 };
        int price = 25;
        System.out.println("Ans: " + soln(arr, price));
    }

    public static float soln(int[] arr, int price) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        float ans = sum / arr.length;
        ans = ans / price;
        return ans;
    }
}