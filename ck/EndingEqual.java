import java.util.*;

public class EndingEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (isEqual(a, b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public static boolean isEqual(String a, String b) {
        int c = a.length() - 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) != a.charAt(c--)) {
                return false;
            }
        }
        return true;
    }
}