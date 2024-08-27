package OOPs.AbstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;



    // If atleast any one method is abstract then the class must be defined as abstract;
    // We cannot create an object of the abstract class;(as if object is created and if we try to access the abstract method which do have their body creates the problem)
    // abstract class can't be made final as final classes can't be overriden but abstract class methods needs to be overriden;
    // It can have constructor but can't be called directly as we can't create its object so we can call through its subclass constructor via super keyword;
    //Constructor will be useful when initialising any final value;

    public Parent(int age) {
        this.age = age;
        this.VALUE = 231241;
    }

    // Since static method does not need object to be accessed hence it can be directly accessed from anywhere via class name;
    static void hello(){
        System.out.println("hey");
    }
    void normal(){
        System.out.println("I am a normal method in the abstract class");
    }
    abstract void career();
    abstract void partner();

}
