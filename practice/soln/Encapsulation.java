class Soln{
    private int age;
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public void getName(){
        System.out.println(name);
    }

    public void setAge(int age){
        this.age=age;
    }

    public void getAge(){
        System.out.println(age);
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Soln s=new Soln();
        s.setName("Rahul Ghosh");
        s.getName();
        s.setAge(24);
        s.getAge();
    }
}