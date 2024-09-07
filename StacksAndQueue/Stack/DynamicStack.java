package StacksAndQueue.Stack;

public class DynamicStack extends CustomStack {

    DynamicStack(){
        super(); //It will call the constructor of the super class(CustomStack) taking no arguments;
    }
    DynamicStack(int size){
        super(size);
    }
    
    public boolean push(int value) throws StackException {
        //This is handling if the stack is full
        if (isFull()) {
            int[] temp = new int[data.length * 2]; //Always increasing the size of the stack so that it does not get full; 
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // Now we can use the push method as original (as same as previous in the customStack class)
        return super.push(value);
    }
}
