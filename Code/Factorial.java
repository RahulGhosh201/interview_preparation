import java.util.*;

public class Factorial {
    public static int fact(int n) {
        // int ans = 1;
        // for (int i = 1; i <= n; i++) {
        //     ans *= i;
        // }
        // return ans;
        if(n>=1) return n*fact(n-1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial of " + n + " is " + ans);
        sc.close();
    }
}
