package OOPs.generics.comparing;

// here Comparable<> is an generic interface; We can create our own generic interface just by mentioning the "interface Name_interface" followed by <T> and then implements its method in anyclass to define its functionality likewise here compareTo is a method which we had to implement it 
public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks -o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return marks+"";
    }

}
