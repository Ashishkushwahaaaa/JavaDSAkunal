package OOPs.Interfaces.ExtendsDemo;

public class Main implements B {

    // We need to implement both method of A and B as B extends the interface A
    @Override
    public void fun() {
        System.out.println("fun of A");
    }

    @Override
    public void Greet() {
       System.out.println("Greet of B");
    }
    
}
