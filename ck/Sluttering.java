
// stutter("incredible") ➞ "in... in... incredible?"
import java.util.*;

public class Sluttering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(soln(s));
    }

    public static String soln(String s) {
        String ans = "";
        String temp = "... ";
        ans += Character.toString(s.charAt(0)) + Character.toString(s.charAt(1)) + temp
                + Character.toString(s.charAt(0)) + Character.toString(s.charAt(1)) + temp + s;
        return ans;
    }
}