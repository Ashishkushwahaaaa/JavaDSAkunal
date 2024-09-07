package StacksAndQueue.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        // CustomQueue queue = new CustomQueue(5);
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);
        // queue.insert(6);

        // queue.display();
        // System.out.println(queue.remove());
        // queue.insert(50);
        // queue.remove();
        // queue.display();
        // System.out.println(queue.peek());
        // System.out.println(queue.peekLast());




        // CircularQueue queue = new CircularQueue(5);
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);

        // queue.display();
        // System.out.println("Removed: "+queue.remove());
        // queue.remove();
        // queue.insert(99);
        // queue.display();
        // System.out.println(queue.insert(6)); //Prints true if successfully inserted;
        // queue.insert(7);
        // queue.display();




         // CustomQueue queue = new DynamicCustomQueue(5);
         DynamicCustomQueue queue = new DynamicCustomQueue(5);
         queue.insert(1);
         queue.insert(2);
         queue.insert(3);
         queue.insert(4);
         queue.insert(5);
 
         System.out.println(queue.isFull());
         queue.insert(6); //Now the queue is full hence it will automatically increase the length of the data size twice of its original;
         System.out.println(queue.isFull());
 
         System.out.println(queue.remove());
         queue.insert(85);
         queue.display();
        
    }
}
