// Main Class in Main

public class DLL {
   private Node head;
   private class Node {
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value=value;
    }
    public Node(int value,Node next,Node prev){
        this.next=next;
        this.prev=prev;
        this.value=value;
    }
   }
   
   public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value) return node;
        
        node=node.next;
        }
        return null;
    }


   public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
   }

   public void insertLast(int value){
        Node node=new Node(value);
        Node last=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;

   }

   public void insertAfter(int after,int value){
    Node p = find(after);//p stands for previous
    if(p==null){
        System.out.println("Doesn't Exist");
        return;
    }
    Node node=new Node(value);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next!=null)node.next.prev=node;
    

   }

   public void display(){
    Node node=head;
    Node last=null;
    while(node!=null){
       System.out.print(node.value+"->"); 
       last=node;
       node=node.next;
    }
    System.out.println("END");
    System.out.println("Print in reverse");
    while(last!=null){
        System.out.print(last.value+"->");
        last=last.prev;
    }
    System.out.println("Start");
   }


}
