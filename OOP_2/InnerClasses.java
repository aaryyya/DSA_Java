//  class Test{
//     static String name;
//     public Test(String name){
//         Test.name=name;
//     }
//   }  

public class InnerClasses {
   static class Test{
    String name;
    public Test(String name){
        this.name=name;
//when not using static for class creation we have the class dependent 
//on the class innnerclass and will need to make object for the class innerclass itself
    }
  }  
  public static void main(String[] args) {

    // InnerClasses.Test a=new InnerClasses().new Test("Kunal");//when not using static for innner class 
    Test a=new Test("kunal");
    Test b=new Test("rahul");
    //if the Test cclass is placed outside then the sout statements would print rahul twice 
    System.out.println(a.name);//the name firstly will be replaceed with kunal 
   System.out.println(b.name);//The name in the Test class outside the innerclasses 
    //class is replaced with rahul the static variable is manipulated once again and the rahul is printed twice
    //making the class static wont make it dependent on class objects
}
}
