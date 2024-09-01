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
}
