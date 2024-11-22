import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter operator: ");
        char op = sc.nextLine().charAt(0);

        if (op == '+') {
            System.out.println(a + "  " + op + " " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + "  " + op + " " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + "  " + op + " " + b + " = " + (a * b));
        } else if (op == '/') {
            System.out.println(a + "  " + op + " " + b + " = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
        sc.close();
    }
}