package OOPs.Interfaces.ExtendsDemo2;

public interface B {
    void Greet();

    //Now again the original problem what we were trying to solve for the multiple inheritance like we will get again as main will be confused which fun() to be called;
    // So gives error, we can't do this in interfaces;
    // Default is for special purpose like we want to expand the interface feature. Its like if all the method have same body so no need to define everywhere.

    // default void fun(){
    //     System.out.println(" I am default interface of B");
    // };
}
