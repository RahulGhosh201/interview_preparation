import java.util.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        soln(s);
        sc.close();
    }

    public static void soln(String s) {
        String[] str = s.split("[\\s,.]+");
        Set<String> set = new LinkedHashSet<>();
        Set<String> seen = new HashSet<>();
        for (String st : str) {
            String temp = st.toLowerCase();
            if (!seen.contains(temp)) {
                set.add(st);
                seen.add(temp);
            }
        }
        for (String num : set) {
            System.out.print(num + " ");
        }
    }
}
