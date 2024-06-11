
// Array is a Subset of Another Array
import java.util.*;

public class Subs {
    public static boolean isSubset(int[] arr, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter n2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for arr2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        if (isSubset(arr, arr2)) {
            System.out.println("It's a subset");
        } else {
            System.out.println("It's not a subset");
        }
        scanner.close();
    }
}