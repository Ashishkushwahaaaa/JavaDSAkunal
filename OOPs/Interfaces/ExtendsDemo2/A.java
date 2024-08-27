package OOPs.Interfaces.ExtendsDemo2;

public interface A {
    // Static interface method should have body;
    //Call via the interface name as it static no need of object;

    // The access modifier of the overriden method must be same or higher but can't make it more restrictive than its parent class; 


    static void greetings(){
        System.out.println("Hey I am static method");
    }
    default void fun(){
        System.out.println("I am default interface");
    }
} 
