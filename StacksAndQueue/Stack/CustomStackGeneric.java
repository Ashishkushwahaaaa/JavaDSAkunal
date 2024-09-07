package StacksAndQueue.Stack;

public class CustomStackGeneric<T> {
    
    Object[] data ; // can be accessed within the package;
    private static final int DEFAULT_SIZE=10;

    CustomStackGeneric(){
        this(DEFAULT_SIZE);
    }
    CustomStackGeneric(int size){
        data = new Object[size];
    }

    private int ptr = -1; //here ptr is -1 hence first we have to increase the ptr and then insert;

    public boolean push(T value) throws StackException{
        if (isFull()) {
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = value;
        return true;
    }
    
    @SuppressWarnings("unchecked")
    public T pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Stack is Empty, can't delete from empty stack");
        }
        return (T)data[ptr--];
    }
    @SuppressWarnings("unchecked")
    public T peek() throws StackException{
        if (isEmpty()) {
            throw new StackException("Can't peek from empty stack");
        }
        return (T)data[ptr];
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

