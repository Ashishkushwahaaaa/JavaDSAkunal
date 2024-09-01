package LinkedList.CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(12);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(11);
        
        list.display();
        
        // list.deleteHead();
        // list.deleteHead();
        list.delete(10);
        list.display();
        list.delete(12);
        list.display();
        list.delete(15);
        
        // list.deleteHead();
        list.display();
        list.delete(11);
        list.display();
        
        list.insertFirst(9);
        list.insertFirst(6);
        list.display();


    }
}
