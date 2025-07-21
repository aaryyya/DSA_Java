public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        // int c=a/b;
        try{
            // divide(a,b);
            // int c=a/b;
            String name="Kunal";
            if(name.equals("Kunal")){
                throw new MyException("idk His name is kunal ig");
            }
        }catch(MyException k){
            System.out.println(k.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("this will always run");
        }


        
        
    } 
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please dont divide by zero");
        }
        
        return a/b;
    }
}
