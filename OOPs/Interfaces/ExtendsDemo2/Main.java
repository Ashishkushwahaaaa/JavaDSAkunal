package OOPs.Interfaces.ExtendsDemo2;

public class Main implements A,B {

    @Override
    public void Greet() {
        System.out.println("hey");
    }

    public static void main(String[] args) {
        A.greetings();
    }
    
}
