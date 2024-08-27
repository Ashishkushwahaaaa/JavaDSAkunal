package OOPs.Introduction;

import Recursion.RecursionBasic.factorial;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        Integer num  = new Integer(45); // Now i can use num. to access many function which cannot be used with int a;
        System.out.println(num);

        // Since primitives can't be modified if they are final;
        
        //Non primitives can be modified even being final but it can't be reassigned to any other object;
        final A Ashish = new A();
        Ashish.name = "Ashish kushwaha"; //Here i change the name of final object;
        System.out.println(Ashish.name);

        // Ashish = new Kushwaha(); // This REASSIGN to the new object can't be done to this final object;


        //GARBAGE COLLECTOR: java do this by own so we can't control over it but there is a method finalize() by which we can say to the java garbage collector that whenever you destroy my any object you should do the things whatever we mentioned in that method;
        // finalize method is defined in the class so if any object of that class is destroyed it will do the action mentioned in this method;

        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A();  //This will create a new object each time and obj will be pointing to this newly created and hence old one will be dereferenced and will be hit by the garbage collector in the future whenever the load increases on the memory; and whenever the obj will be distroyed a finalize method of class A will called and the following action will be performed;
        }

    
    }
}
class A{
    final int num = 10;
    String name ;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("The obj is distroyed");
    }
}
