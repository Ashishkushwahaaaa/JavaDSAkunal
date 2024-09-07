package StacksAndQueue.Queue;

public class CircularQueue{
    
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        data = new int[size];
    }

    // TC : O(1);
    public boolean insert(int value) throws Exception{
        if (isFull()) {
            throw new Exception("Queue FULL");
        }
        data[end++]=value;
        end %=data.length;
        size++;
        return true;
    }
    
    // TC : O(1);
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue EMPTY");
        }
        int removed = data[front++]; //Firstly saves the value in removed whatever is at front and then increase the front;
        front = front%data.length;
        size--;
        return removed;
    }

    public int peek(){
        return data[front];
    }

    public void display(){
        if (isEmpty()) {
            System.out.println("EMPTY QUEUE");
            return;
        }

        int temp = front;
        do{
            System.out.print(data[temp++] + " -> ");
            temp %= data.length;
        }while(temp!=end);

        System.out.println("END");
    }

    protected boolean isEmpty() {
        return size==0;
    }
    protected boolean isFull() {
        return size==data.length;
    }

}
