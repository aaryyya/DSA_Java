public class CustomStack {
    protected int[] dataarray;
    private static final int DEFAULT_SIZE=10; 
    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);//constructor inside constructor
    }
    
    public CustomStack(int size){
        this.dataarray=new int[size];
    }

    public boolean push(int item){
        if (isFull()){
           return false; 
        }
        ptr++;
        dataarray[ptr]=item;
        return true;
    }  

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty Stack!");
        }
        int removed =dataarray[ptr];
        ptr--;
        return removed;
        //or insetad syntax return dataaarray[ptr--]
    }

    public int peek() throws StackException{ 
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty Stack!");
        }
        return dataarray[ptr];
    }

    private boolean isFull(){
        return ptr==dataarray.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }
}
