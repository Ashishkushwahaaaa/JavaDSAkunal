package LinkedList.DoublyLL;

import LinkedList.SinglyLL.PositionNotInRangeException;

public class Main {
    public static void main(String[] args) throws PositionNotInRangeException{
        DLL list = new DLL();
        // list.insertFirst(34);
        // list.insertFirst(18);
        list.insertFirst(9);
        list.insertFirst(14);
        
        list.display();
        list.insertLast(24);
        list.insertLast(7);
        // list.displayRev();
        
        list.insertAfter(66, 112);
        list.display();
    }
}
