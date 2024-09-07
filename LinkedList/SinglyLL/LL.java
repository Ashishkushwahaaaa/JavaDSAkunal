package LinkedList.SinglyLL
;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        // node.next = null;
        tail = node;
        size++;
    }

    public void insertAt(int value, int position) throws PositionNotInRangeException {
        if (position > size) {
            throw new PositionNotInRangeException(
                    "Position value out of Range, Insert position value in range (0-" + size + ")");
        }
        if (position == 0) {
            insertFirst(value);
            return;
        }
        if (position == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        // node.next=temp.next;
        temp.next = node;
        size++;
    }


    // Insertion using Recursion:


    public void InsertRec(int val, int index){
        head = InsertRec(val, index, head);
    }
    public Node InsertRec(int val, int index, Node node){
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = InsertRec(val, index-1, node.next);
        return node;
    }

    // public void insertRec(Node temp, int value, int position,int count){
    //     if (count==1) {
    //         temp = head;
    //     }
    //     if (position==0) {
    //         Node node = new Node(value);
    //         node.next = head;
    //         head = node;
    //         if (tail==null) {
    //             tail = head;
    //         }
    //         return;
    //     }
    //     if (count==position) {
    //         Node node = new Node(value);
    //         node.next = temp.next;
    //         temp.next = node;
    //         if (temp.next==null) {
    //             tail = node;
    //         }
    //         return;
    //     }
    //     if (count<position) {
    //         if (temp.next==null) {
    //             System.out.println("can't insert");
    //             return;
    //         }
    //         insertRec(temp.next, value, position, count+1);
    //     }
    // }


//Removing the duplicate from the sorted ll
    public void deleteDuplicate(){
        head = deleteDuplicates(head);
    }

    // private void deleteDuplicates(Node node){
    //     if (node.next==null) {
    //         tail = node;
    //         return;
    //     }
    //     if (node.value == node.next.value) {
    //         node.next = node.next.next;
    //         size--;
    //         deleteDuplicates(node);
    //         return ;
    //     }
    //     deleteDuplicates(node.next);
    //     return ;
    // }

    private Node deleteDuplicates(Node node){
        if (node.next==null) {
            tail = node;
            return node;
        }
        if (node.value == node.next.value) {
            node.next = node.next.next;
            size--;
            node = deleteDuplicates(node);
            return node;
        }
        node.next = deleteDuplicates(node.next);
        return node;
    }    


    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (tail == null) {
            return -1;
        }
        int val = tail.value;
        if (size == 1) {
            deleteFirst();
            return val;
        }
        Node secondNode = get(size - 1);
        tail = secondNode;
        tail.next = null;
        return val;
    }

    public int deleteAt(int position) {
        if (position == 0) {
            return deleteFirst();
        }
        if (position == size - 1) {
            return deleteLast();
        }
        if (position >= size) {
            return -1;
        }
        Node previousNode = get(position);
        int val = previousNode.next.value;
        previousNode.next = previousNode.next.next;
        return val;
    }

    public int find(int value) {
        Node node = head;
        int position = -1;
        while (node != null) {
            position += 1;
            if (node.value == value) {
                return position;
            }
            node = node.next;
        }
        return -1;
    }

    public Node get(int position) {
        Node node = head;
        for (int i = 1; i < position; i++) {
            node = node.next;
        }
        return node;
    }


    // Solved on LEETCODE using recursion (Q. 21)
    public static LL mergeTwoSortedLL(LL list1, LL list2){
        Node f = list1.head;
        Node s = list2.head;
        LL tail = new LL();
        while (f!=null && s!=null) {
            if (f.value <= s.value) {
                tail.insertLast(f.value);
                f = f.next;
            }
            tail.insertLast(s.value);
            s = s.next;
        }
        while(f!=null) {
            tail.insertLast(f.value);
            f = f.next;
        }
        while (s!=null) {
            tail.insertLast(s.value);
            s = s.next;
        }
        return tail;
    }





    public void display() {
        Node temp = head;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        if (head != null) {
            System.out.println("END"); // This is to keep check while deletion if no element left then still it was
                                       // print END rather than to print no element
        } else {
            System.out.println("END of list, No Element found");
        }
        // System.out.println(temp.value); //if checking while(temp.next!= null){}
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.insertLast(9);
        list2.insertLast(12);

        list1.display();
        list2.display();
        LL tail = LL.mergeTwoSortedLL(list1, list2);
        tail.display();

    }
}
