package OOPs.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Ashish = new Human(23,"Ashish");
        // Human twin = new Human(Ashish);  //this method of creating clone of an object is not good as it takes more time and overheads;
        
        Human twin = (Human)Ashish.clone();
        System.out.println(twin.age + " " + twin.name);
        
        System.out.println(Arrays.toString(Ashish.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));//Changes made for twin,Also reflecting in the original one; known as SHALLOW COPY;
        System.out.println(Arrays.toString(Ashish.arr));// Due to Deep copy now the original will not be changed.

    }
}
