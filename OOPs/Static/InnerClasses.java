package OOPs.Static;

public class InnerClasses {
    
    static class Test{
        String name ;
        Test(String name){
            this.name = name;
        }
        public String toString(){
            return name;
        }
    }
    public static void main(String[] args) {

        Test A = new Test("Ashish"); //This is fine if Test class is outside of the InnerClasses. but here Test class itself depends on the other class so we can't access it. To access it we need to make it static so that it does not depends on any object of the outerclass and can be used from anywhere. 
        Test B = new Test("Ash");

        System.out.println(A.name);
        System.out.println(B.name);
        System.out.println(A); //Gives the random value as println calls its own toString method if it not found in the class of the object A; To resolve this we can create own toString class;



        // SIMPLY A CLASS MUST BE STATIC TO BE USED FROM STATIC CONTEXT IF IT IS DEFINED INSIDE ANOTHER CLASS.
        // It does not means that being static it will change the value of the variable for all the object if changed through any one object;

        // FOR EXAMPLE: if this Test class is outside and variable "name" is declared static then A.name and B.name will print same value. But class being static only means it can be called from the static method;

        // WHY NEED TO CREATE OBJ IF CLASS IS STATIC: because we need to access the field name which is nonstatic so we need to create an object. Static class doesn't mean we don't need to create and object.
    }
}
