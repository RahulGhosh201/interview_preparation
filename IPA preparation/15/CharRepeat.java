// aabbcc=a2b2c2
// abbccc=a1b2c3

import java.util.*;

public class CharRepeat {

    public static String soln(String s) {
        char[] result = new char[s.length() * 2];
        int index = 0, count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;// in this way we can determine the frequency of each charcter
            } else {
                result[index++] = s.charAt(i - 1);// ekta character store holo answer e
                String str = Integer.toString(count);// eta temporary sting jate integer theke string e convert korchi
                for (char c : str.toCharArray()) {
                    result[index++] = c;// result r modhye store korchi
                }
                count = 1;
            }
        }
        String ans = "";
        // return new String(result, 0, index);
        for (int i = 0; result[i] != '\0'; i++) {
            ans += result[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));

    }
}
