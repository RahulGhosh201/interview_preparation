import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t != 0) {
            String s = sc.nextLine();
            System.out.println(isValid(s));
            t--;
        }
    }

    public static boolean isValid(String s) {
        String[] str = s.split("[//s,.]+");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 3) {
                return false;
            }
        }
        if (str.length != 4)
            return false;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (!Character.isDigit(str[i].charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}