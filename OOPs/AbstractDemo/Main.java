package OOPs.AbstractDemo;


public class Main {
    public static void main(String[] args) {
        Son son = new Son(5);
        son.career();

        son.normal(); //Using the parent class method as its been extended by this class.

        // Parent daughter = new Daughter(6); //Even we can't create object but We can do like this;
        Daughter daughter = new Daughter(6);
        daughter.career();

        Parent.hello(); //Static method calling via class name directly;
    }
}
