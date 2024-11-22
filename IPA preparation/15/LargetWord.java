import java.util.*;

public class LargetWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        String[] str = s.split("[\\s,]+");
        int t = Integer.MIN_VALUE;
        String ans = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > t) {
                t = str[i].length();
                ans = str[i];
            }
        }
        System.out.println("Ans: " + ans);
    }
}