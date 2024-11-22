import java.util.*;

public class Count_Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("[\\s,]+");
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (Character.isUpperCase(str[i].charAt(0))) {
                cnt++;
            }
        }
        System.out.println("Ans: " + cnt);
    }

}
