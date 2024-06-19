import java.util.*;

interface Car {
    public void sound();

    // public void drive(){
    // System.out.println("We drive a car");
    // }// method can't have a body
}

class Zeep implements Car {
    public void sound() {
        System.out.println("Zeep makes sound");
    }

    public void turn() {
        System.out.println("Zeep makes a turn");
    }
}

public class Interface {
    public static void main(String[] args) {
        Zeep zeep = new Zeep();
        zeep.sound();
        zeep.turn();
    }
}