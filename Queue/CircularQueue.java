public class CircularQueue {

    protected int[]dataarr;
    private static final int DEFAULT_SIZE=10;
    protected int end=0 ;
    protected int front=0;
    private int size=0;


    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.dataarr=new int[size];
    }

    public boolean isFull(){
        return size==dataarr.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        dataarr[end++]=item;
        end =end%dataarr.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty");
        }
        int removed=dataarr[front++];
        front =front%dataarr.length;
        size--;
        return removed;

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return dataarr[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        int i=front;
        do{
            System.out.print(dataarr[i]+"->");
            i++;
            i%=dataarr.length;
        }while(i!=end);
        System.out.println("END");

    }
}
