package OOPs.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr = new int[]{1,2,4,5,6};

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Human(Human other){
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    // Here interface Cloneable do not have any abstract method then why we need to implement this method: because its tells the JVM that this class can use the clone method or not,else it will throw an exception CloneNotSupportedException;

    // public Object clone() throws CloneNotSupportedException{
    //     // This is known as shallow copy: in this the primitives are copied to the clone but non primitives like object(arrays),string, it just refer to the old one rather than to copy it too; Hence any changes made via clone one will also reflects in the original ones;
    //     return super.clone();
    // }

    public Object clone() throws CloneNotSupportedException{

        //Deep copy
        Human twin = (Human)super.clone(); //Shallow copy

        //Now converting above shallow copy to deep copy; this is the simple process as priviously twin array was referencing to the old one but now we create a new twin array and copy all the elements of Ashish.arr;
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
