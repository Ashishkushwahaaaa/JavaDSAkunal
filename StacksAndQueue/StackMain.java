package StacksAndQueue;

public class StackMain {
    public static void main(String[] args) throws StackException{
        // CustomStack stack = new CustomStack(5);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // // stack.push(6); since stack will be full so throw exception
        
        // System.out.println("Peeking: " + stack.peek()); //print the element at the top;

        // // stack.ptr = 2; //If we do not make the ptr private then anyone can manipulate the ptr which should not be allowed;

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); //since stack will be empty after deletion due to above so throw exception
        

        // DynamicStack stack = new DynamicStack(6);
        CustomStack stack = new DynamicStack(6); // Now we can access all the method and properties which are in the CustomStack but (Execution happens of which are present in the DynamicStack)of DynamicStack;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        // stack.push(9);
        // stack.push(10);
        // stack.push(11);
        // stack.push(12);
 

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // // System.out.println(stack.pop());



        // CustomStackGeneric<String> stack = new CustomStackGeneric<>();
        // stack.push("Ashish");
        // stack.push("Ashiqka");
        // System.out.println(stack.pop());

    }
}
