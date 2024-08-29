package OOPs.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Ashish = new Student(35, 86.6f);
        Student Ash = new Student(36, 93.1f);
        Student Arpit = new Student(45, 95.6f);
        Student Ashika = new Student(32, 73.5f);
        Student Ashu = new Student(25, 84.4f);

        Student[] list = {Ashish, Ash, Arpit, Ashika, Ashu};
        System.out.println(Arrays.toString(list));

        // Arrays.sort(list); //java will be confused on what basis it should compare so here too the compareTo method is necessary;
        //Rather than doing and creating that comparable interface for this array we can directly do as below, we need to just instantiate Comparator and then implement its method.

        Arrays.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                int diff = (int)(o1.marks-o2.marks); //If want to compare on the basis of rollno then simply (o1.rollno - o2.rollno) and this is already in int type;
                return diff;
            }
            
        });

        //Converting above in LAMBDA EXPRESSION (if a code can be written in one line it use arrow operator ->)
        
        // Arrays.sort(list, (o1, o2) -> {
        //     int diff = (int)(o1.marks-o2.marks); //If want to compare on the basis of rollno then simply (o1.rollno - o2.rollno) and this is already in int type;
        //     return diff;
        // });

        System.out.println(Arrays.toString(list));

        // We can't do this as Student have two arguement hence java will be confused which one you want to compare me; So to do this we use the compareTo method by implementing the Comparable interface
        // if (Ashish<Ash) {
        //     System.out.println("Ash has more marks");
        // }


        // if (Ashish.compareTo(Ash) < 0) {
        //     System.out.println("Ash has more marks");
        // }

        // else if (Ashish.compareTo(Ash)>0) {
        //     System.out.println("Ashish has more marks");
        // }
        // else{
        //     System.out.println("Both have the same marks");
        // }
    }


}
