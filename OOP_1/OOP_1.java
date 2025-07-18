// package OOP_1;

import java.util.Arrays;

public class OOP_1 {
    public static void main(String[] args) {


        //Wrapper Class
        int a=1;
        int b=2;
        swap(a,b);
        System.out.println("a="+a+""+"b="+b);

        Student student1 = new Student(4, 9, "Lover");
        System.out.println("1) from student1 object"+student1.name);
        System.out.println("2) from student1 object"+student1.roll);
        System.out.println("3) from student1 object"+student1.marks);
        System.out.println("4) Name Changing to using changeName constructor: " );
        student1.changeName(" grass");
        System.out.println("5) Name Changed to using changeName constructor:"+ student1.name);
        Student newbie = new Student(student1);
        System.out.println("6) helo heres the name-> "+newbie.name+" <-this name is from the student1 check copy cons student1 is being passed to newbie here the reference variable of the student class with object having(name,marks,rollno parameters) ");
        System.out.println();
        // this
        // this has oject inside it thats why the contructor in student class prints
        // the values inside the student for the constructor Student (Student newone)
        // and is redirected here due to same argument type n no. of args passed
        System.out.println("7)Name: from the other object named as \"student1\" passed to newbie:" + newbie.name);
        System.out.println("8) roll: from the other object named as \"student1\" passed to newbie:" + newbie.roll);
        System.out.println("9) marks: from the other object named as \"student1\" passed to newbie:" + newbie.marks);
        System.out.println();
        Student newz = new Student();
        System.out.println("10) This oone is called from empty contructor  " + newz.name);
        final A kunal =new A("Kunal");
        kunal.name="other _name";
        // kunal=new A("new Obj"); final 

        int[] arr = new int[5];
        func(arr);
        System.out.println(Arrays.toString(arr));
        // func2(arr);
        arr = new int[10];
        System.out.println(Arrays.toString(arr));
    }

    static void func(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
    static void func2(int[] arr) {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        // System.out.print(a,b);
    }
}
class A{
    final int num=10;
    String name;
    public A(String name){
    this.name=name; 
}
}
class Student {
    int roll;
    int marks;
    String name;

    void changeName(String name) {
        this.name = name;
    }

    Student() {
        // this.name="Arya";
        // // this.roll;
        // this.marks=10;
        this(40, 110, "Default Name");
    }

    Student(int rno, int marks, String n) {
        this.roll = rno;
        this.marks = marks;
        this.name = n;
    }

    Student(Student newone) {// object being passed into another constructor
        // constructor that takes value from another object
        this.name = newone.name;
        this.marks = newone.marks;
        this.roll = newone.roll;
    }
}
