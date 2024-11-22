import java.util.*;

public class MaxAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        int temp = 0;
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            if (a > temp) {
                temp = a;
                ch = s.charAt(i);
            }
        }
        System.out.println("Ans: " + ch);
    }
}