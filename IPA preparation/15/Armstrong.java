import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int res = 0;
        while (n != 0) {
            int rem = n % 10;
            res += rem * rem * rem;
            n /= 10;
        }
        if (res == temp) {
            System.out.println(temp + " is an armstrong number");
        } else {
            System.out.println(temp + " is not an armstrong number");
        }
        sc.close();
    }
}
