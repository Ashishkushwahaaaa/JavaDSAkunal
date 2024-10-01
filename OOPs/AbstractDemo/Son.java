package OOPs.AbstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void normal(){
        // super.normal();
        System.out.println("I am normal method overriden in the son class");
    }

    @Override
    void career(){
        System.out.println("I wants to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love her");
    }

}
