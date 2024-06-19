abstract class Car{
    abstract public void sound();

    public void drive(){
        System.out.println("Car is driving");
    }
}

class Car1 extends Car{
    public void sound(){
        System.out.println("Car makes sound");
    }

    public void turns(){
        System.out.println("Car turns");
    }
}

public class Abstract{
    public static void main(String[] str){
        Car1 c=new Car1();
        c.sound();
        c.drive();
        c.turns();
    }
}