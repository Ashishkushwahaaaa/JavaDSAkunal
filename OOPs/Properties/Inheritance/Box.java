package OOPs.Properties.Inheritance;

public class Box {

    private double l;
    double w;
    double h;

    // Since this is the static method hence it can be inherited but can't be overriden;
    static void Greetings(){
        System.out.println("I am in the Box class, Greetings!");
    }

    public Box() {
        // super(); //Since Box class do not have any super class so this super class will call the Object class from where every class is derived whether one which is already provided by the java or the one to which we create

        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
        
    }


}
