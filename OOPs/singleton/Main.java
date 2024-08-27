package OOPs.singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton obj = new Singleton(); //We can't do this as Singleton class is private;
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // All the 3 ref variable pointing to just one obj;
    }
    
}
