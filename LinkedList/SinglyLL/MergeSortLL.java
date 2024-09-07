package LinkedList.SinglyLL;

public class MergeSortLL {

    private ListNode head;
    private ListNode tail;
    private int size;

    public MergeSortLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public static void main(String[] args) {
        MergeSortLL list = new MergeSortLL();

        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        // list.insertFirst(19);
        // list.insertFirst(20);

        // sort the list and update the head;
        // list.head = list.sortList(list.head);
        // update the tail after the list got sorted
        // list.updateTail();

        // System.out.println("Head: " + list.head.val);
        // System.out.println("Tail: " + list.tail.val);
        // System.out.println("Size: " + list.size);
        list.display();

        // list.bubble(list.size-1, 0);
        // list.reverseLL(list.head);
        // list.head = list.reverseList(list.head);
        // list.reverseInPlace(list.head);
        list.head = list.reverseKGroup(list.head, 2);
        list.display();
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.val <= right.val) {
            left.next = merge(left.next, right);
            return left;
        }
        right.next = merge(left, right.next);
        return right;


        //ANOTHER METHOD TO MERGE THE LIST:

        // ListNode dummyHead = new ListNode();
        // ListNode tail = dummyHead;
        // while (left != null && right != null) {
        //     if (left.val <=right.val) {
        //         tail.next = left;
        //         left = left.next;
        //         tail = tail.next;
        //     }else{
        //         tail.next = right;
        //         right = right.next;
        //         tail = tail.next;
        //     }
        // }
        // tail.next = (left!=null)? left: right;
        // return dummyHead.next;

    }

    // Find the mid and breaks the list in two halves mid will be represented by the
    // slow pointer and it is the part of the second half
    public ListNode getMid(ListNode head) {
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        return slow;

        // ANOTHER METHOD TO FIND THE MID AND SPLIT THE LIST: 

        // ListNode midPre = null;
        // while (head!= null && head.next != null) {
        // midPre=(midPre==null) ? head: midPre.next;
        // head = head.next.next;
        // }
        // ListNode mid = midPre.next;
        // midPre.next = null;
        // return mid;
    }



    public void bubble(int r, int c){
        if (r==0) {
            return;
        }
        if(c<r) {
            ListNode first = get(c);
            ListNode second = get(c+1);
            if (first.val > second.val) {
                //for swapping three cases must be considered: 
                if (first==head) {
                    first.next = second.next;
                    second.next = first;
                    head = second;
                }else if(second==tail){
                    ListNode prev = get(c-1);
                    prev.next = second;
                    first.next = null;
                    second.next = first;
                    tail = first;
                }else{
                    ListNode prev = get(c-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubble(r, c+1);
        }
        bubble(r-1, 0);
    }






    // REVERSING A LIST : RECURSION;
    // public  void reverseLL(ListNode node){
        // if (node==tail) {
        //     head=tail;
        //     return;
        // }
        // reverseLL(node.next);
        // tail.next = node;
        // tail = node;
        // tail.next = null;

        public ListNode reverseList(ListNode head) {
            // space O(n), time O(n)
            if (head == null || head.next == null) {
                return head;
            }
    
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    // }

    // REVERSING WITHOUT RECURSION;

    private void reverseInPlace(ListNode node){
        if (node==null) {
            return;
        }
        ListNode prev = null;
        ListNode pres = node;
        ListNode Next = node.next;

        while (pres!= null) {
            pres.next = prev;
            prev = pres;
            pres = Next;
            if (Next==null) {
                head = prev;
                break;
            }
            Next = Next.next;
        }

    }



    public ListNode get(int position) {
        ListNode node = head;
        if (position<0) {
            return null;
        }
        for (int i = 0; node.next!=null && i < position; i++) {
            node = node.next;
        }
        return node;
    }






    public ListNode reverseKGroup(ListNode head, int k) {

        if (k <= 1 || head == null || head.next == null) {
            return head;
        }

        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int timesReverse = length/k; //How many groups to be reversed (outer loop will run for timesReverse times)

        ListNode prev = null;
        ListNode cur = head;
        ListNode last = prev;

        while (timesReverse>0) {
            ListNode endLast = cur;

            // If a group contains k (given) node then k pass required to fully reverse it
            for (int i = 1; cur != null && i <= k; i++) {
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            endLast.next = cur;
            last = endLast;
            prev = null; //not required as wherever will be the prev just our endLast will point and at the last due to line "endLast.next = cur;" it wil be changed;
            timesReverse--;
        }
        return head;
    }









    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
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

    public void updateTail() {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp; // Set tail to the last node
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


































// BY CHATGPT WHEN THE ABOVE CODE WAS HAVING SOME ERROR;    



// package LinkedList.SinglyLL;

// public class MergeSortLL {

// private ListNode head;
// private ListNode tail;
// private int size;

// public MergeSortLL() {
// this.size = 0;
// }

// public void insertFirst(int value) {
// ListNode node = new ListNode(value);
// node.next = head;
// head = node;
// size++;
// if (tail == null) {
// tail = head;
// }
// }

// public static void main(String[] args) {
// MergeSortLL list = new MergeSortLL();

// list.insertFirst(23);
// list.insertFirst(2);
// list.insertFirst(53);
// list.insertFirst(7);
// list.insertFirst(3);
// list.insertFirst(13);
// list.insertFirst(19);
// list.insertFirst(20);

// // Sort the list and update the head
// list.head = list.sortList(list.head);

// // Update the tail to point to the last node after sorting
// list.updateTail();

// System.out.println("Head: " + list.head.val);
// System.out.println("Tail: " + list.tail.val);
// list.display();
// }

// public ListNode sortList(ListNode head) {
// if (head == null || head.next == null) {
// return head;
// }
// ListNode mid = getMid(head);
// ListNode left = sortList(head);
// ListNode right = sortList(mid);
// return merge(left, right);
// }

// public ListNode merge(ListNode left, ListNode right) {
// ListNode dummyHead = new ListNode();
// ListNode tail = dummyHead;

// while (left != null && right != null) {
// if (left.val <= right.val) {
// tail.next = left;
// left = left.next;
// } else {
// tail.next = right;
// right = right.next;
// }
// tail = tail.next;
// }
// tail.next = (left != null) ? left : right;
// return dummyHead.next;
// }

// public ListNode getMid(ListNode head) {
// ListNode midPre = null;
// ListNode slow = head;
// ListNode fast = head;

// // Move fast pointer two steps and slow pointer one step at a time
// while (fast != null && fast.next != null) {
// midPre = (midPre == null) ? head : midPre.next;
// slow = slow.next;
// fast = fast.next.next;
// }
// // Disconnect the left half from the right half
// ListNode mid = midPre.next;
// midPre.next = null;
// return mid;
// }

// public void display() {
// ListNode temp = head;
// while (temp != null) {
// System.out.print(temp.val + " -> ");
// temp = temp.next;
// }
// System.out.println("END");
// }

// public void updateTail() {
// ListNode temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// tail = temp; // Set tail to the last node
// }

// public class ListNode {
// int val;
// ListNode next;
// ListNode() {}
// ListNode(int val) { this.val = val; }
// ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
// }
