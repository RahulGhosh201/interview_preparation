public class ConvenienceStore {
    public static void main(String[] args) {
        int[] change1 = { 25, 20, 5, 0 };
        double totalDue1 = 4.25;
        System.out.println(changeEnough(change1, totalDue1));

        int[] change2 = { 30, 40, 20, 5 };
        double totalDue2 = 12.55;
        System.out.println(changeEnough(change2, totalDue2));
    }

    public static boolean changeEnough(int[] change, double totalDue) {

        double quarters = change[0] * 0.25;
        double dimes = change[1] * 0.10;
        double nickels = change[2] * 0.05;
        double pennies = change[3] * 0.01;

        double totalChange = quarters + dimes + nickels + pennies;

        return totalChange >= totalDue;
    }
}
