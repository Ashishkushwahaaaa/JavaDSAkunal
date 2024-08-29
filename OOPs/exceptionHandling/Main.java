package OOPs.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            // int c = a/b;
            int c = divide(a,b);
            System.out.println(c);

            // CALLLING OUR OWN CREATED EXCEPTION "MYEXCEPTION" ;
            String name = "Ashish";
            if (name.equals("Ashish")) {
                throw new Exception("The name Ashish");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always execute in the finally block");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException {
       if (b==0) {
        throw new ArithmeticException("Please do not divide by zero");
       }
       return a/b;
    }
}
