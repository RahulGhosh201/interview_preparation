import java.util.*;

public class Index {

    public static int soln(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "Carrot";
        char c = 'a';
        char ch = 'z';
        System.out.println(soln(s, c));
        System.out.println(soln(s, ch));
    }
}