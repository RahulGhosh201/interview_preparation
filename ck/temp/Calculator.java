import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter opertor: ");
        char op = sc.nextLine().charAt(0);
        soln(a, b, op);
        sc.close();
    }

    public static void soln(int a, int b, char op) {
        if (op == '+') {
            System.out.println("a" + op + "b: " + (a + b));
        } else if (op == '-') {
            System.out.println("a" + op + "b: " + (a - b));
        } else if (op == '*') {
            System.out.println("a" + op + "b: " + (a * b));
        } else if (op == '/') {
            System.out.println("a" + op + "b: " + (a / b));
        } else if (op == '%') {
            System.out.println("a" + op + "b: " + (a % b));
        }
    }
}