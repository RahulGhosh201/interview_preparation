import java.util.*;

public class CharAtOdd {
    public static void main(String[] args) {
        System.out.print("Enter str: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Ans: ");
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
}