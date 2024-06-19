class ArithmeticOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        ArithmeticOperation a = new ArithmeticOperation();
        System.out.println(a.add(4.5f, 2.8f));
        System.out.println(a.add(2, 5));
        System.out.println(a.add(1, 2, 3));
    }
}