package String;

import java.util.ArrayList;
import java.util.Arrays;

public class String_and_Immutability {
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
        System.out.printf("\nThe value of num with 2 decimal precision is: %.2f \n", num);

        System.out.println('a');
        System.out.println('a'+'b');
        System.out.println('a' + 1);
        System.out.println((char)('a'+1));
        System.out.println((char)('b'-1));
        System.out.println((char)('a'+ 25));
        System.out.println((char)('a'+'b'));
        System.out.println("a" + "b");
        System.out.println("a"+1);
        System.out.println("a"+new ArrayList<>());
        // System.out.println(new Integer(56)+new ArrayList<>()); //This expression can't be solved as + operator can only work if atleast one is string type
        // System.out.println(new Integer(56)+ "" +new ArrayList<>());
        // Java doesn't support operator overloaded but only exception is + operator in case of string only.
        // + operator works in case of primitives and atleast one is a string type.

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series += ch;
        }
        System.out.println(series); 
        //This have a time complexity of n2 as string are immutable and hence each time a new object is created and old one is copied to it along with new one character and hence it also waste too much space as each time there will increasing length of dereferenced string leaved unused.

        // SO TO OVERCOME THIS PROBLEM THERE IS AN ANOTHER DATA TYPE WHICH CHANGES IN ITS ORIGINAL VALUE AND NO NEED OF NEW OBJECT EACH TIME

        // STRING BUILDER:

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString()); //Now we can convert it to String
        // Many more methods of builder...
        System.out.println(builder.reverse());
        System.out.println(builder.deleteCharAt(0));

        // Some Methods of String:
        String myname = "Ashish Kushwaha";
        System.out.println(Arrays.toString(myname.toCharArray())); //it will print the arrays of the characters
        System.out.println(myname.toLowerCase());
        System.out.println(myname.indexOf("ai"));
        System.out.println(          "      Ashish       ".strip());
        System.out.println(Arrays.toString(myname.split(" "))); //Here inside split method we have to define any criteria to split the string.In this case it is an empty spaced string so where ever an space occures in our string it splits from there.
    }
}
