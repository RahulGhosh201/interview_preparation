import java.util.*;

public class Largest_Smallest {
    public static void main(String[] args) {
        int[] arr = { 7, 8, -1, 10, 5, 2 };
        int s = arr[0], l = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < s) {
                s = arr[i];
            }
            if (arr[i] > l) {
                l = arr[i];
            }
        }
        System.out.println("Largest: " + l + " Smallest: " + s);

    }
}