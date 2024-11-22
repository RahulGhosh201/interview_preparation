import java.util.*;

public class MaxPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] dia = new int[row + col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    dia[index++] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i + j == row) {
                    dia[index++] = arr[i][j];
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < dia.length; i++) {
            if (isPrime(dia[i])) {
                ans = Math.max(ans, dia[i]);
            }
        }
        System.out.println("Ans: " + ans);

    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
