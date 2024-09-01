package LinkedList.DoublyLL;

import LinkedList.SinglyLL.PositionNotInRangeException;

// import LinkedList.SinglyLL.PositionNotInRange;

public class DLL {

    Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!=null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node last = getLast();
        if (last==null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        last.next = node;
        node.prev = last;
        node.next = null;
    }
    public void insertAfter(int position, int val) throws PositionNotInRangeException{
        if (head==null) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
            if (temp==null) {
                throw new PositionNotInRangeException("Position out of Range, Insertion possible in range (0-" + i + ")");
            }
        }

        if (temp.next==null) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    public Node getLast(){
        Node last = head;
        if (last==null) {
            return last;
        }
        while (last.next!=null) {
            last = last.next;
        }
        return last;
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }
    public void displayRev(){
        Node last = getLast();
        System.out.println("Printing in Reverse Order");
        while (last!=null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }


    class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    
    }
}
