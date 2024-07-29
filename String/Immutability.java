package String;

import java.util.Arrays;

public class Immutability {
    public static void main(String[] args) {
        // All the strings are save in the string pool inside the heap rather than directly inside the heap for efficient memory management
        // It means whenever we create a string with the same value, all the variable points to the same object;
        // Then the question is that what happen if we try to change the value of any one variable, will it change for all the variable.
        String a = "Ashish";
        System.out.println(a);
        a="Kushwaha";
        System.out.println(a);
        // The answer is no,Why? Because string is immutable then why the value is seems to be change for the variable which is attempt to be change.
        // Because when we try to change the value it does not change the original value string are immutable but it just create another object in the pool. 
        // TO VERIFY THE ABOVE STATEMENT:
        // We know == is comparator and gives true if both the variable have is refering to the same object.
        String name1 = "Ashish";
        String name2= "Ashish";
        System.out.println(name1==name2); //This will print true as both variable name1 & name2 refering to the same object in the string pool

        // How to create two different string object with same value? Ans : by using "new" keyword;
        String name3 = new String("Ashish");
        String name4 = new String("Ashish");
        // Now both have same value but == comparator will give false as both does not refering to the same object:
        System.out.println(name3==name4);
        // To compare value in string we use .equals method
        System.out.println(name3.equals(name4));
        // Hence, we also verified string in pool having same value refer to the same object and hence it is efficient so we must use this method rather than to create new object.
        System.out.println(name1.charAt(3));

        // Every print function uses string method and print the string value of whatever is provided and hence the it also print the textual value of the object which looks of no use to use so we override the toString method of Arrays to print the Arrays type of object
        System.out.println(new int[] {1,2,3,4}); 
        System.out.println(Arrays.toString(new int[] {1,2,3,4}));

        //PRETTY PRINTING:(Format Specifier)
        float num = 112.1274f;
        System.out.printf("The value of num is: %f", num);
        System.out.printf("\nThe value of num with 2 decimal precision is: %.2f", num);
        
    }
}
