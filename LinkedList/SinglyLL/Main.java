package LinkedList.SinglyLL;

public class Main {
    public static void main (String[] args) throws PositionNotInRangeException {
        LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(5);
        // list.insertFirst(4);
        // list.insertFirst(2);
        // list.insertLast(9);
        // list.insertLast(15);
        // list.insertAt(34, 6);
        
        // list.display();
        // System.out.println("The deleted node value: "+list.deleteFirst());
        // list.display();
        // System.out.println("The item deleted was "+list.deleteLast());
        list.display();
        int deleted = list.deleteAt(2);
        if (deleted == -1) {
            // System.out.println("Can't delete from the empty list");
        }else{
            System.out.println("The item deleted was "+deleted);
        }
        list.display();
        // System.out.println("Item found at position : " + list.find(3));


    }
}
