package StacksAndQueue.Stack;

public class CustomStack {
    
    int[] data ; // can be accessed within the package;
    private static final int DEFAULT_SIZE=10;

    CustomStack(){
        this(DEFAULT_SIZE);
    }
    CustomStack(int size){
        data = new int[size];
    }

    private int ptr = -1; //here ptr is -1 hence first we have to increase the ptr and then insert;

    public boolean push(int value) throws StackException{
        if (isFull()) {
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = value;
        return true;
    }
    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Stack is Empty, can't delete from empty stack");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }
    public int peek() throws StackException{
        if (isEmpty()) {
            throw new StackException("Can't peek from empty stack");
        }
        return data[ptr];
    }
    
    boolean isEmpty() {
        // if (ptr==-1) {
        //     return true;
        // }
        // return false;

        return ptr==-1;
    }

    boolean isFull() {
    //    if (ptr==data.length-1) {
    //     return true;
    //    }
    //    return false;
        return ptr==data.length-1;
    }
}
