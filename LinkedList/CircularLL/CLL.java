package LinkedList.CircularLL;

public class CLL {

    private Node head;
    private Node tail;

    public void insertFirst(int val){
        System.out.println("Inserting: " + val);

        Node node = new Node(val);
        if (head == null) {
            node.next = node;
            head = tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        head = node;
    }
    public void deleteHead(){
        int val = -1;
        // If no element in the list.
        if (head == null) {
            System.out.println("Empty list, can't delete!");
            return;
        }
        // If only one element is in the list.
        if (head == tail) {
            val = head.val;
            head = tail = null;
        }
        if (head!=null) {
            val = head.val;
            tail.next = head.next;
            head = tail.next;
        }
        System.out.println("Deleted Node value: " + val);
    }

    public void delete(int val){
        Node node = head;
        if (node==null) {
            System.out.println("Can't delete from empty list");
            return;
        }
        if (node.val == val) {
            if (head == tail) {
                System.out.println("Deleting node " + val);
                head = tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return ;
        }
        do{
            Node n = node.next;
            if (n.val == val) {
                System.out.println("Deleting node " + val);
                node.next = n.next;
                if (n==tail) {
                    tail = node;
                }
                break;
            }
            node = node.next;
        }while(node!=head);

        if (tail!=null) {
            System.out.println("New head " +head.val);
            System.out.println("New tail " +tail.val);
        }
    }


    public void display(){
        Node temp = head;
        if (head!=null) {
            do{
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while(temp != head);
            System.out.println("HEAD");
            return;
        }
        if (head == null) {
            System.out.println("Empty list, Nothing to display!");
        }
    }

    
    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        
    }
}
