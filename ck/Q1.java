import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        System.out.println("Enter elements for a:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter elements for b: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Ans: " + soln(a, b));
        sc.close();
    }

    public static int soln(int[] a, int[] b) {
        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    sum += a[i];
                }
            }
        }
        return sum;
    }
}