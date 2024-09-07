package StacksAndQueue.Queue;

public class DynamicCustomQueue extends CircularQueue {

    DynamicCustomQueue(){
        super();
    }
    DynamicCustomQueue(int size){
        super(size);
    }
    
    public boolean insert(int value) throws Exception{
        if(isFull()) {
            int[] temp = new int[data.length * 2]; //Always increasing the size of the queue so that it does not get full; 
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)%data.length];
            }
            front=0;
            end = data.length;
            data = temp;
        }
        // Now we can use the insert method as original (as same as previous in the CustomQueue class)
        return super.insert(value);
    }



}
