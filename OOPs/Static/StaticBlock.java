package OOPs.Static;

// This is to show initialization of the static varaiable;
public class StaticBlock {
    static int a = 4;
    static int b;
    
    // This block run exactly once when the object is created i.e. when the class is loaded for the first time;
    static{
        System.out.println("I am in the static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b); //Here obj is created to show the behaviour of the static block for different obj and does not meant to create obj to call static variable as it can be called without obj reference;
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock(); //Here, new object is created but now the staticBlock is not called for the second as we can see else it have printed its content two times because staticBlock are called exactly once;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
