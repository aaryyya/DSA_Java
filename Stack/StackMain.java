public class StackMain{
    public static void main(String[] args) throws StackException {
        // CustomStack stack=new CustomStack(5);
        CustomStack stack=new DynamicStack(5);
        stack.push(25);
        stack.push(2);
        stack.push(5);
        stack.push(55);
        stack.push(55);
        stack.push(55);
        stack.push(55);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
