import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += rem * rem * rem;
            n /= 10;
        }
        if (temp == ans)
            return true;
        else
            return false;
    }
}
