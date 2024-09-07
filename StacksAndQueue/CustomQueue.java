package StacksAndQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    @SuppressWarnings("unused")
    private int size = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    // TC: O(1);
    public boolean insert(int value) throws Exception{
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end] = value;
        end++;
        size++;
        return true;
    }

    //In queue, this way of removal of an elements takes O(n) TC; To reduce it circular queue is used;
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Empty Queue");
        }
        int Removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        size--;
        return Removed;
    }
    public int peek(){
        return data[0];
    }
    public int peekLast(){
        return data[--end];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+ " <- ");
        }
        System.out.println("END");
    }

    protected boolean isEmpty() throws Exception {
       return end==0;
    }
    protected boolean isFull() {
       return end==data.length-1;
    }
}