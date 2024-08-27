package OOPs.Properties.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am the shapes area");
    }

    // In Method overridding which method to be called(whether of the child class or the parent class) is done at run time hence it is also called LATE BINDING;
    // Early binding:If the method is declared FINAL THEN IT CANNOT BE OVERRIDDEN and hence it is done at compile time (hence also known as EARLY BINDING)

    // final void area(){
    //     System.out.println("I am the shapes area");
    // }
    
}
