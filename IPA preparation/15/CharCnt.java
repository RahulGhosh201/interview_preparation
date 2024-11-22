import java.util.*;

public class CharCnt {
    public static void main(String[] args) {
        String str = "Priyanka";
        char ch = 'a';
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt++;
            }
        }
        System.out.println("Ans: " + cnt);
    }
}
