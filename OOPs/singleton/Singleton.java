package OOPs.singleton;

//Singleton class is a class which allows only one instance to be created. To do so firstly we need to stop others to call its constructor as each time the constructor will be called the new object is created. 
// In order to do so we need to make its constructor as private;
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance==null) {
            instance = new Singleton();
        }
       return instance;
    }

}
