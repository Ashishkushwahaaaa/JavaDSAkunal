package OOPs.Properties.Inheritance;

public class BoxWeight extends Box {
    double weight ;
    double h ;

    // The below method is inherited but cannot be overriden;

    // @Override
    // static void Greetings(){
    //     System.out.println("I am in the BoxWeight class, Greetings!");
    // }

    
    BoxWeight(){
        this.weight = -1;
        // this.h = -4;

        // System.out.println("0args height via this keyword: "+this.h); //This will first check in subclass then in superclass;
        // System.out.println("0 args via super keyword: "+super.h); //This will directly check in the superclass.
  

    }
    BoxWeight(double l, double w, double h, double weight){

        // FIRST USE OF THE SUPER KEYWORD
        super(l,w,h); //Used to initialise the values present in the parent class;
        this.weight = weight;

        // Super keyword always call only the parent class just above it;
        // If any class don't have the super class i.e. no class above it then the super keyword calls the object class as all the class are derived from the Object class;

        //SECOND USE OF THE SUPER KEYWORD:
        //We can use it at the place of "this" keyword to but then why it is different? the answer is that when we use this then if the variable is present in the subclass then it will for sure use the subclass variable rather than to use super class variable;
        // System.out.println("4 args const printing height via this keyword: "+this.h); //This will first check in subclass then in superclass;
        // System.out.println("4 args const via super keyword: "+super.h); //This will directly check in the superclass.

    }
  
    
}
