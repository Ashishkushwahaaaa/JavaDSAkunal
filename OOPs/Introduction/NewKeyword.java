package OOPs.Introduction;

public class NewKeyword {
    public static void main(String[] args) {

        //we uses the new keyword to create the new object;

        Student2 A; // Just declaring the object and hence no memory is allocated;
        A = new Student2(); // new keyword is used to dynamically allocate the memory to the object;

        // Student A = new Student(); //Declaration + Allocation;
        Student2 B = A; //Now both A and B are refering to the same object;

        A.name = "Something Something";
        System.out.println(B.name);

    }
}
class Student2 {
    int rollno;
    String name;
    float marks;
}
