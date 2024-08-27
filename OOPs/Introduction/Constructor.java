package OOPs.Introduction;

public class Constructor {

    static int age =8;
    public static void main(String[] args) {
        

        Student Ashish = new Student();
        // Student Ash = new Student();
        // // Ashish.rollno=35;

        // System.out.println(Ashish.rollno);
        // System.out.println(Ash.rollno);

        // Ashish.greeting();

        Student Abhay = new Student(30, 41, "Abhay Kushwaha");
        System.out.println(Abhay.name);

    //Here, i am just passing the object Ashish to the object Kushwaha it simply means that whatever the value of the instance variable for Ashish will be also for the newly object Kushwaha;
        Student Kushwaha = new Student(Ashish);

        System.out.println(Kushwaha.age);

        Student random = new Student(); //this should call default constructor and if it is calling another constructor then the name of that other constructor will be printed if it does not have its own else it will print the name present in the itself constructor;
        System.out.println(random.name);
  
    }


    

}
class Student{
    int age  ;
    int rollno;
    String name;

    void greeting(){
        System.out.println("Hello! very goodmorning , my name is " + this.name);
    }
    

//Passing object to the constructor;
    Student(Student other){
        this.age = other.age;  //Kushwaha.age = Ashish.age (will treat it like that)
        this.rollno = other.rollno;
        this.name = other.name;
    }

// This is known as the default constructor; Constructor are a special type of fuction which are called when the object is created;

    Student(){
        
        // CALLING ANOTHER CONSTRUCTOR FROM OTHER CONSTRUCTOR; It should be the first statement in the constructor;
        //usecase of the "this" keyword;
        this(1,34,"RandomPerson");

        System.out.println("this is the default constructor");

    //This constructor will print same value for all the object but we need to print different value for the different object;
        // this.age = 31;
        // this.rollno = 35;
        // this.name = "Ashish Kuhswaha";




    }

    
    Student(int years, int rollno, String name){

        System.out.println("this is the constructor with 3 argument");


        age = years; //The class variable name (instance variable) should not be same as the argument variable(as it can't distinguish which variable is which one and which one is assigned to whom) 
        
        this.rollno = rollno; // But they can be made same by using this keyword, this keyword generally refers to the variable of this class;
        this.name = name;
    }
}
