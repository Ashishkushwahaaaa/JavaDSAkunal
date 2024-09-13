package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueDeque {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); //Empty stack exception

        // First element to be pushed is the last one to be popped out ---> FILO OR LIFO
        // Stacks are internally based on the arrays;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);

        // System.out.println(queue.peek()); //Show the first element of the queue
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        // First element to be added was the first to be removed
        // Internal implementation of Queue data structure are based on linkedlist;
        // Insertion is done from the back while removal is from the front;

        // QUEUE is an interface(having only abstract data type) whereas STACK is a class;


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);

        System.out.println(deque.element());
        System.out.println(deque.offerLast(5)); //Insert at the last and return true if successfully inserted;
        System.out.println(deque.offerFirst(9)); //Insert at the front of the deque and return true if successfull;
        System.out.println(deque.getLast()); // Retrieves, but does not remove, the first element of this deque,
        System.out.println(deque.getFirst());


        // Deque is internally implemented based on the ArrayDeque class in which insertion and deletion can be done from both the side
        // Using ArrayDeque class to implement as a stack is faster than the java stack and if used as a queue will be faster than the linkedlist of the java;

        
    }

}
