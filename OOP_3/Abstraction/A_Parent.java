abstract class Parent{
    abstract void career(String name);
    int age;
    public Parent(int age){
        this.age=age;
    }
}

class Son extends Parent{
    public Son(int age){
        super(age);
    }
    @Override
    void career(String name){
        System.out.println("Career"+name);
    }
}
public class A_Parent{
public static void main(String[] args) {
//    Parent mom=new Parent(); you vcant create the object of abstract class
    Son son=new Son(2);
    son.career("hi");
  
}
} 