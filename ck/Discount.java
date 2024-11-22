import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        System.out.println("Enter percentage: ");
        int percentage = sc.nextInt();
        System.out.println("Price after discount: " + soln(price, percentage));
        sc.close();
    }

    public static float soln(int a, int b) {
        float c = 0;
        c = a - ((a * b) / 100);
        return c;
    }
}