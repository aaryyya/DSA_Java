
public class LinkedList{
    private Node head;
    private Node tail;
    private int size;

    
    private class Node{
        private int value;
        private Node next;
        public Node(int value){//this constructor is used when u are suppposed to add only the single values like only add last or first element 
            this.value=value;
        }

        public Node(int value,Node next){//if u only had this constuctor u then will need to specify null is being passed that is nothing is passed for the cuurent use
            this.value=value;
            this.next=next;
        }
    }

    public LinkedList(){
        this.size=0;
    }




    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }


    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
        }
        if(index==size){
            insertLast(value);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public Node insertRec(int value,int index , Node node){
        if(index==0){
        Node temp=new Node(value, node);
        size++;
        return temp;
        }
        node.next=insertRec(value, index--, node.next);
        return node;

    }
    public void insertRec(int value,int index){
        head=insertRec(value, index, head);
    }

    public int deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if(size<=1) return deleteFirst();
        Node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        return value;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
            }
            return node;
    }

    public int delete(int index){
        if(index==0) return deleteFirst();
        if(index==size-1) return deleteLast();
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        return value;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value) return node;
        
        node=node.next;
        }
        return null;
    }
    

    

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


    
    
}
