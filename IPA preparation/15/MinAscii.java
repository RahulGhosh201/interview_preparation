import java.util.*;

public class MinAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static char soln(String s) {
        int ans = Integer.MAX_VALUE;
        char ch = '\0';
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i);
            if (temp < ans) {
                ans = temp;
                ch = s.charAt(i);
            }
        }
        return ch;
    }
}
