import java.util.*;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String str = sc.nextLine();
        int x = sc.nextInt();
        int count1 = 0, count2 = 0;
        char[] temp = new char[str.length()];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            temp[index++] = str.charAt(i);// converting the string to a character array
        }

        for (int i = 0; i < str.length(); i++) {
            // int p = Integer.parseInt(String.valueOf(str.charAt(i)));

            if (isPrime(temp[i] - '0')) {// converting the character to a integer value and to that we just have to -'0'
                count1++;
            }
        }
        System.out.println("Ans: " + count1);
        while (x != 0) {
            int rem = x % 10;
            if (isPrime(rem)) {
                count2++;
            }
            x /= 10;
        }
        System.out.println("Ans: " + count2);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}