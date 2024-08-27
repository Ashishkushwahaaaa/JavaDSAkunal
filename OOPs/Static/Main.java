package OOPs.Static;

public class Main {
    public static void main(String[] args) {
        // Human Ashish = new Human(22, "Ashish", 100000, false);
        // Human Ash = new Human(24, "Ash", 15000, false);
        
        // System.out.println(Human.population);
        // System.out.println(Human.population);

        // greeting(); //We cannot call any non-static method from static content
        Main funObj = new Main();
        funObj.fun();

    }

    // IN GENERAL, STATIC CAN HAVE ONLY STATIC METHOD WHEREAS NON-STATIC CAN HAVE BOTH;(as nonstatic depends on the object so it can call the method that depends on the object and also to those who don't depends on the object)

// This does not dependent on the objects; 
    static void greet(){
        // greeting(); //Since greet don't need object then how it can call a method which is dependent on the object whithout referencing it; same like the main method;

        //you can't access a nonstatic stuff without referencing their instances in a static context;
        // Hence, here i am referencing it;
        // Main obj = new Main();
        // obj.greeting(); //Now i can call a nonstatic a I have referenced it to a object inside the static method;
        

    }

    void fun(){
        greeting(); // Here, nonstatic calling a nonstatic so we don't need object for greeting but now to call "fun" we need to create an object as in the last no matter from which type of method you are calling a function it will we called through main which is static. So Object is must to be created to run a nonstatic method;
    }

    // We know that something that is non static, belongs to an instance means it needs object to call.
    void greeting(){
        greet(); //Calling static from non-static
        System.out.println("Hello World");
    }
}
