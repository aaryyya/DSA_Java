//package OOP_3.Inheritance;

public class Main {
    public static void main(String[] args) {
       Box box=new Box();
       System.out.println("box: " +box.l+" "+box.w+" "+box.h); 
       Box box2=new Box(5);
       System.out.println("box2: " +box2.l+" "+box2.w+" "+box2.h); 
       Box box3=new Box(5.5,5.1,2.1);
       System.out.println("box3: " +box3.l+" "+box3.h+" "+box3.w); 
       Box box4=new Box(box2);
       System.out.println("box4 inheriting box2: " +box4.l+" "+box4.w+" "+box4.h); 
       Box box5=new BoxWeight(2,3,4,8);
       System.out.println(box5); 
    }
    
    
}
