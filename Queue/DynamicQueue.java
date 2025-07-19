public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }
    @Override
    public boolean insert(int item){
        if(this.isFull()){
            int []temp=new int[dataarr.length*2];
            for(int i=0;i<dataarr.length;i++){
                temp[i]=dataarr[(front+i)%dataarr.length];
            }
            front=0;
            end=dataarr.length;
            dataarr=temp;

        }
        return super.insert(item);
    }
}
