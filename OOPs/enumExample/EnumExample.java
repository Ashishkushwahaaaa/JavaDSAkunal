package OOPs.enumExample;

public class EnumExample {

    // Enum is a special type of data type that represents a group of named constants. It's a way to define a set of fixed values that a variable can take;
    // Enum values are constants, meaning they can't be changed once they're defined.
    // Enums profide type safety. ensuring that a variable can only hold one of the predefined values.

    enum Week implements A{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        // These are enum constant. 
        //Since these are constant values so convention is to represent in the capital letters;
        // These are public,static and final
        // since final can't create child enum
        // enum type is Week

        Week(){
            System.out.println("Constructor is called for " + this.toString());
        }
        //This is not public or protected, only private or final;
        // why? because we don't want to create new object.
        // this is not the enum concept,that's why

        @Override
        public void hello() {
           System.out.println("Hey! how are you");
        }

        //internally : public static final Week MONDAY = new Week();

        // enum cannot extend a class but can implement as many as interfaces;
        // It cannot have abstract method;

        
    }


       public static void main(String[] args) {
            Week week = Week.TUESDAY;

            // for (Week day : Week.values()) {
            //     System.out.println(day);
            // }

            // System.out.println(week.ordinal());


       }
       
       
}
