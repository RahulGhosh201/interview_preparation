import java.math.BigInteger;

public class Q6 {

    // Function to calculate the number of distinct positions
    public static int countDistinctPositions(int[] coordinates, int sizeOfBoard) {
        // Extract coordinates
        int x1 = coordinates[0], y1 = coordinates[1], x2 = coordinates[2], y2 = coordinates[3];

        // Ensure the coordinates are within the bounds of the board
        if (!isWithinBounds(x1, y1, sizeOfBoard) || !isWithinBounds(x2, y2, sizeOfBoard)) {
            return 0; // Invalid coordinates for the board
        }

        // Calculate the differences in x and y
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        // The number of distinct positions is given by GCD(dx, dy) + 1
        // The "+1" accounts for the starting position itself
        return gcd(dx, dy) + 1;
    }

    // Helper method to check if coordinates are within the bounds of the board
    private static boolean isWithinBounds(int x, int y, int sizeOfBoard) {
        return (x >= 0 && x < sizeOfBoard) && (y >= 0 && y < sizeOfBoard);
    }

    // Helper method to calculate GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        int[] coordinates1 = { 2, 8, 3, 4 };
        int sizeOfBoard1 = 13;
        int output1 = countDistinctPositions(coordinates1, sizeOfBoard1);
        System.out.println("Output 1: " + output1); // Expected: 3

        // Test case 2
        int[] coordinates2 = { 2, 6, 2, 4 };
        int sizeOfBoard2 = 7;
        int output2 = countDistinctPositions(coordinates2, sizeOfBoard2);
        System.out.println("Output 2: " + output2); // Expected: 2
    }
}
