import java.util.*;

public class RemoveKey {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 1 };
        int key = 1;
        int[] ans = soln(arr, key);
        System.out.println("Ans: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] soln(int[] arr, int key) {
        // int[] ans;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                ans.add(arr[i]);
            }
        }
        int[] temp = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            temp[i] = ans.get(i);
        }
        return temp;

    }
}