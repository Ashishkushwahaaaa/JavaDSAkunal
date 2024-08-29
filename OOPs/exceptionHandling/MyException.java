package OOPs.exceptionHandling;

// THIS IS HOW WE DEFINE OUR OWN EXCEPTION;
public class MyException extends Exception {
    
    public MyException(String message){
        super(message);
    }
}
