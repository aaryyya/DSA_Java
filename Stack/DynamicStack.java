public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            int []temp=new int[dataarray.length*2];
            for(int i=0;i<dataarray.length;i++){
                temp[i]=dataarray[i];
            }
            dataarray=temp;

        }
        return super.push(item);
    }
    
}
