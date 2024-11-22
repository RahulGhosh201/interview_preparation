import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter s2: ");
        String s2 = sc.nextLine().toLowerCase();
        if (isAnagram(s1, s2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagaram");
        }
        sc.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] sa1 = s1.toCharArray();
        Arrays.sort(sa1);
        char[] sa2 = s2.toCharArray();
        Arrays.sort(sa2);
        if (Arrays.equals(sa1, sa2)) {
            return true;
        } else {
            return false;
        }

    }
}
