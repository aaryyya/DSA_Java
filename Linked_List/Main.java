public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(35);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertLast(25);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(15);
        list.insert(500, 2);
        list.insertRec(78, 0);
        // list.display();
        // System.out.println(list.delete(3));
        list.display();
        System.out.println(list.deleteFirst());
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        System.out.println(list.delete(3));
        list.display();
        System.out.println(list.find(45));

        DLL dll = new DLL();
        dll.insertFirst(2);
        dll.insertFirst(12);
        dll.insertFirst(112);
        dll.display();
        dll.insertLast(11);
        dll.insertLast(115);
        dll.display();
        dll.insertAfter(2, 78);
        dll.display();


        CLL cll=new CLL();
        cll.insert(24);
        cll.insert(54);
        cll.insert(4);
        cll.display();
        cll.delete(54);
        cll.display();




    }
}