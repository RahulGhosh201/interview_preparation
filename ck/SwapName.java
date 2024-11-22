import java.util.*;

public class SwapName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static String soln(String s) {
        String[] str = s.split("[\\s,.]+");
        String temp = str[0];
        str[0] = str[1];
        str[1] = temp;
        String ans = "";
        ans += str[0] + " " + str[1];
        return ans;
    }
}