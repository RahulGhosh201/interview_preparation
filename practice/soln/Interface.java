interface Car {
    public void sound();
}

class Toyota implements Car {
    public void sound(){
        System.out.println("Car honks");
    }
}

public class Interface{
    public static void main(String[] args){
        Toyota toyota=new Toyota();
        toyota.sound();
    }
}