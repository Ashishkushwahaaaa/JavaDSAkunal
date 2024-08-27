package OOPs.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes circle2 = new Circle();
        Shapes square2 = new Square();

        circle.fun();
        circle.area();
        
        
        // Here square is refering to Shapes then is can only access to those method from its own class which are also present in the Shapes class
        square.area(); //Left side tells us, what they are refering to and can only access to those but the funtion which one will be called is of the types of object; 
        square2.area();
        
        circle2.area();
        // circle2.fun(); //Here, it can not be accessed because circle2 is refering to the Shapes class and that is why Shapes class also must have this fun method;
        
        // CONCLUSION: If any child class obj is refering to the parent class then, only those method of the child class will be accessed which are also present in the parent class;

/*
 

        // TYPES OF POLYMORPHISM:
        1)Compile time/Static Polymorphism: Method Overloading;(Same name of the methods but the no of args, ordering of types of args,types and the return will be different ) ex: multiple constructor;
        2)Run time/Dynamic Polymorphism: Method Overriding;(Child class overriding the same method available in the parent class with may or may not having same body)
        
        

        // TILL NOW WHAT I UNDERSTOOD ABOUT INHERITANCE AND POLYMORPHISM IS: in both we are using the parent class properties, in inheritance we using same as defined in the parent class in addition to own but in polymorphism we use the parent class but in own way by method overloading and overriding(by defining the parent method in child method as we want it to be). 

        We cannot override the final method;
        final keyword is also used to prevent inheritance; just use the final before the class;
        if a class is final then its all the method is final;
 */        
    }
}
