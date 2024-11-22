import java.util.*;

public class Intersection {

    public static HashSet soln(int[] a, int[] b) {
        HashSet set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[5];
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter elements for a: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter elements for b: ");
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }
        set = soln(a, b);
        // Integer[] c = new Integer[set.size()];
        // set.toArray(c);
        // int[] d=
        for (int it : set) {
            System.out.println(it + " ");
        }

    }
}