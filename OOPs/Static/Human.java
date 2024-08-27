package OOPs.Static;

public class Human {
    int age ;
    String name;
    int salary;
    boolean Married;
  
    // long population;   //Even if there is many object are created the value of population remains same but the population must increase by 1 with the creation of a new object;

    static long population;  // So to make this type of variable which should be same for everyone we declare it as static;
    

    static void message(){
        System.out.println("Hello I display a message");
        // System.out.println(this.age); //"this "can't be used here as "this" depends on the object and hence we cannot use inside which does not depends on the object;
    }

    
    // Any class can have static method and static variable; The most common static method is public static void main (or the main method);
    
    // It is static because it is the first method to be run and to call any non-static method firstly we need to create a object of that class so if main would be the non-static then to make it run we need to create its object. Here, Starvation condition occure like main ask for the object to be created and to create object main should run first.
    



    Human(int age, String name, int salary, boolean Married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.Married = Married;
        Human.population +=1; // The static variable doesn't need reference of any object and hence can be called directly by the class name;
    }
}

