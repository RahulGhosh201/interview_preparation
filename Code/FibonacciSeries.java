import java.util.*;

public class FibonacciSeries {

    public static void soln(int n) {
        int a = 0, b = 1;
        while(n!=0){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter n:");
        int n = sc.nextInt();
        soln(n);
        sc.close();
    }
}
