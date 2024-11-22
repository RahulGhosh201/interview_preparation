import java.util.*;

public class Q12 {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2 };
        swapElements(arr);
        System.out.println("Final Array: " + Arrays.toString(arr));
    }

    public static void swapElements(int[] arr) {
        int n = arr.length;

        // To ensure we do not repeat swaps or go out of bounds, we'll keep track of
        // visited positions.
        boolean[] visited = new boolean[n];

        // Try swapping each element based on its value (arr[E] spaces to the left or
        // right)
        for (int i = 0; i < n; i++) {
            // Only swap if this element has not been visited yet.
            if (!visited[i]) {
                int current = i;
                while (!visited[current]) {
                    visited[current] = true;
                    int swapPosition = current + arr[current];

                    // Ensure the swap position is within bounds
                    if (swapPosition >= 0 && swapPosition < n) {
                        // Swap the elements
                        int temp = arr[current];
                        arr[current] = arr[swapPosition];
                        arr[swapPosition] = temp;
                        current = swapPosition; // Move to the next position
                    } else {
                        break; // If the swap position is out of bounds, stop
                    }
                }
            }
        }

        // If you want to output the number 2 after sorting/swapping
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                System.out.println("Found the number 2 at index " + i);
            }
        }
    }
}
