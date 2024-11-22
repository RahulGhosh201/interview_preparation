import java.util.*;

public class NonRepeated {

    public static String soln(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (ans.indexOf(str.charAt(i)) == -1) {
                ans += str.charAt(i);
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String str = sc.nextLine();
        String ans = soln(str);
        System.out.println("Ans: " + ans);
        sc.close();
    }
}