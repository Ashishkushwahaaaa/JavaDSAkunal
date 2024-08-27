package OOPs.Properties.Inheritance;

public class Main{
    public static void main(String[] args) {
        // Box b1 = new Box();
        // Box b2 = new Box(4);
        // System.out.println(b1.h + " " + b1.w);
        // System.out.println(b2.h + " " + b2.w + " " + b2.l);

        //BoxWeight extends Box hence it have all the properties of Box other than its own but it cannot access the private things of the class Box;
        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.h + " " + box3.weight + " " + box3.l); 

        // BoxWeight box4 = new BoxWeight(1,2,3,4);
        // System.out.println(box4.h + " " + box4.weight);



        //******Which member can be accessed is determined by the reference type and not the object type;************
        // Box box5 = new BoxWeight(2,4,5,6); //Here, box5 is a reference variable of reference type Box and object is of type BoxWeight;
        
        //Since child can initialise to the variable even of the parent class that's why the object of child class can be refered by the reference variable of type parent class , and hence the variable of the parent class is initiallised so it can use but in case of vice-versa the parent class can't initialise the variable of the child class hence the reference variable of type child class can't access its variable;

        // Box box5 = new BoxWeight(2,4,5,6); //Since the box5 is a variable of reference type Box that's why we can use the variable of the Box;
        // System.out.println(box5.h);




        //There are many variable given in the parent and child classes.
        // You are given access to variable that are type of reference type i.e. BoxWeight.
        // Hence, you should have access to weight variable;
        // This also means, that the ones you are trying to access should be initialised.
        // But here, when the object itself is of type parent class, then how you will call the constructor of child class.
        // This is why error.

        // BoxWeight box6 = new Box(2,3,4);
        // System.out.println(box6.weight);


        Box.Greetings();

        BoxWeight bw1 = new BoxWeight(); //This can be done representing we can inherit the static method;

        Box box = new BoxWeight(); //This we have studied that if the class is overriden then the method should run of the BoxWeight if present in the Box(accessed those present in the parent class), but it still running the method of parent class as it static method and we can not overriden because static does not depends on the objects but overridding does so we can't override static method;
        box.Greetings();


/* 
        //TYPES OF INHERITANCE:
        1)Single Inheritance: one class extends only one class;
        2)Multilevel Inheritance : child class extended from the parent class itself is a parent for other child class;
        3)Multiple Inheritance: One class is extended from many class(Java doesn't support this, we achieve this by the help of interface);
        4)Hierarichal Inheritanace: one class is inherited by many class;
        5)Hybrid Inheritance: Combination of single and multiple Inheritance;
*/
    }
}