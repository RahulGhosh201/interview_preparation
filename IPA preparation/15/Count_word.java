import java.util.*;

public class Count_word {
    public static void main(String[] args) {
        String s = "Home, Sweet Home, Home rahul";
        String[] str = s.split("[\\s,]+");// \\s means white spaces , means commas + means one or more occurences of
                                          // either white spaces or commas
        String strt = "Home";
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(strt)) {
                count++;
            }
        }
        System.out.println("Ans: " + count);
    }
}