// package Queue;

public class CustomQueue {
    private int[]dataarr;
    private static final int DEFAULT_SIZE=10;
    int end=0 ;


    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.dataarr=new int[size];
    }

    public boolean isFull(){
        return end==dataarr.length;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        dataarr[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed=dataarr[0];
        //shift  all the elements to the previous index in aan array
        for(int i=1;i<end;i++){
            dataarr[i-1]=dataarr[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return dataarr[0];
    }


    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(dataarr[i]+" <-");
        }
        System.out.println("end");
    }






}
