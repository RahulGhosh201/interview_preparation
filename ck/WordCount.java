import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static int soln(String s) {
        String[] arr = s.split("[\\s,.]+");
        return arr.length;
    }
}