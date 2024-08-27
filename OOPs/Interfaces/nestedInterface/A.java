package OOPs.Interfaces.nestedInterface;

public class A {

    // Top level interface can be only public or default but the nested interface can be public, private, protected or default;

    //nested Interface
    public interface InnerA {
        boolean isOdd(int num);
    }
}

class B implements A.InnerA{
    public boolean isOdd(int num){
        return (num&1)==1;
    }
}