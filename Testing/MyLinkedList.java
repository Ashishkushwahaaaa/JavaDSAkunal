package Testing;

public class MyLinkedList {
    ListNode head;
    ListNode tail;
    static int size = 0;
    public MyLinkedList() {
        head = new ListNode();
        tail = new ListNode();
    }
    
    public int get(int index) {
        if(index<0 || index>size-1){
            return -1;
        }
        ListNode temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        // ListNode temp = new ListNode(val);
        // size++;
        // if(head==null){
        //     head = temp;
        //     tail = temp;
        //     return;
        // }
        // temp.next = head;
        // head = temp;





        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;
        if (tail == null) {
            tail = head;
        }
    }
    
    public void addAtTail(int val) {
        // if(tail==null){
        //     addAtHead(val);
        //     return;
        // }
        // ListNode temp = new ListNode(val);
        // // temp.next = tail.next;
        // tail.next = temp;
        // tail = temp;
        // size++;

        if (tail == null) {
            addAtHead(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        // node.next = null;
        tail = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>(size)){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode temp = head;
        for(int i = 1; i< index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        // if(index<0 || index>(size-1)){
        //     return;
        // }
        // if(index == 0){
        //     head = head.next;
        //     if(head==null){
        //         tail = null;
        //     }
        //     size--;
        //     return;
        // }
        // ListNode temp = head;
        // for(int i = 1; i< index; i++){
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // if (index==size-1) {
        //    tail = temp; 
        // }
        // size--;







        if (index == 0) {
            int val = head.val;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return ;
        }
        if (index == size - 1) {
            if (tail == null) {
                return;
            }
            // int val = tail.val;
            // if (size == 1) {
            //     deleteFirst();
            //     return val;
            // }

            ListNode node = head;
            for(int i = 1; i< index; i++){
                node = node.next;
            }
            ListNode secondNode = node;
            tail = secondNode;
            tail.next = null;
            return ;
        }
        if (index < 0 || index >= size) {
            return;
        }
        ListNode node = head;
        for(int i = 1; i< index; i++){
            node = node.next;
        }
        ListNode previousNode = node;
        // int val = previousNode.next.val;
        previousNode.next = previousNode.next.next;
        return ;
    }

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(){}
        public ListNode(int val){
            this.val = val;
        }
    }
}
