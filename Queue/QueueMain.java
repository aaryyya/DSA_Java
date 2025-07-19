public class QueueMain {
    public static void main(String[] args) throws Exception{
        // CustomQueue queue= new CustomQueue();
        // CircularQueue queue= new CircularQueue();
        DynamicQueue queue= new DynamicQueue();
        queue.insert(4);
        queue.insert(3);
        queue.insert(9);
        queue.insert(2);
        queue.insert(2);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
        queue.insert(2);
        queue.display();


    }
}
