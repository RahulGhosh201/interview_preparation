import java.util.*;

public class Majority {
    public static void main(String[] args) {
        int[] array = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        int majority = findMajorityElement(array);

        if (majority != -1) {
            System.out.println("Majority element: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }

    public static int findMajorityElement(int arr[]) {
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        int[] freq = new int[temp + 1];
        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i]] > arr.length / 2) {
                return arr[i];
            }
        }

        return -1;
    }
}