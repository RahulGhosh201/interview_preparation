import java.util.*;

public class FLOEW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("[\\s,]+");
        String ans = "";
        for (int i = 0; i < str.length; i++) {
            ans += str[i].charAt(0);
        }
        System.out.println("Ans: " + ans);
    }
}