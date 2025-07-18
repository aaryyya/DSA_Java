import java.util.*;
public class InBuiltDS{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.push(45));
        stack.push(05);
        stack.push(25);
        stack.push(2);
        stack.push(1);
        stack.pop();
        System.out.println();
        Queue <Integer>queue=new LinkedList<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        Deque<Integer> dequ=new ArrayDeque<>();
        dequ.add(89);
        dequ.addLast(4);
        dequ.removeFirst()

        // System.out.println(stack.toArray());
    }
}