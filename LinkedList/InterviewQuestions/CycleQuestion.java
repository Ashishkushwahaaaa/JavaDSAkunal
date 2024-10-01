package LinkedList.InterviewQuestions;


public class CycleQuestion {

    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode node){
        ListNode fast = node;
        ListNode slow = node;

        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            int length = 0;
            if(fast == slow){
                do{
                    slow = slow.next;
                    length ++;
                }while(slow!=fast);
            }
            return length;
        }
        return 0;
    }

    //Refer LEETCODE solution for even more good solution and see its note (Q. 142).
    public ListNode detectCycle(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        int length = 0;

        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                do{
                    slow = slow.next;
                    length ++;
                }while(slow!=fast);
                break;
            }
        }
        if (length==0) {
            return null;
        }
        //Move the second pointer by length of the cycle;

        ListNode f = node;
        ListNode s = node;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // Now the s is at length time of the cycle, start moving f and s one step together and when they meet it will be start of the cycle;
        while (s!=f) {
            s= s.next;
            f = f.next;
        }
        return s;
    }


    // A NUMBER IS HAPPY OR NOT(GOOGLE QUESTION):

    public boolean isHappy(int n){
        int x = nodeValue(n);
        ListNode node = new ListNode(x);
        ListNode slow = node;
        ListNode fast = node;
        if (x!=1) {
            x = nodeValue(x);
            node.next = new ListNode(x);
            slow = node.next;
            node = node.next;
            x = nodeValue(x);
            node.next = new ListNode(x);
            fast = node.next;
            node = node.next;
            if (fast==slow) {
                return false;
            }
        }
        return true;        
    }


    public int nodeValue(int n){
        int sum = 0;
        while(n>0){
            sum =sum + (int)Math.pow(n%10,2);
            n= n/10;
        }
        return sum;
    }







    class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
}

