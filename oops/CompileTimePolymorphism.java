class Display {
    // Method to display an integer
    public void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Overloaded method to display a string
    public void show(String b) {
        System.out.println("String: " + b);
    }

    public int show(int a, int b) {
        return a + b;
    }

}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Display display = new Display();

        // Calling the overloaded methods
        display.show(10); // Calls show(int a)
        display.show("Hello"); // Calls show(String b)
        System.out.println(display.show(5, 10));
    }
}
