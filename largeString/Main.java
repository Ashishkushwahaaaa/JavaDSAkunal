package largeString;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    
    //String buffer: Mutable, efficient as no need to create new obj each time while changes is made. its Thread safe means one thread can access it at a time(due to which its also a slower);
    // Main difference between String builder and String buffer is that String builder is not a thread safe; 

    public static void main(String[] args) {
        
        // Constructor 1;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //Constructor 2; Initiallization at the time of instance creation with some value;
        StringBuffer sb2 = new StringBuffer("very charming");
        System.out.println(sb2);
        
        // Constructor 3; setting the initial capacity (default 16)
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        

        // Append
        sb.append("Ashishgreat");
        sb.append(" is a great techi");

        // Insert
        sb.insert(6, "Kushwaha");

        // Replace
        sb.replace(14, 19, " The android devs");

        // Delete
        sb.delete(14, 26);

        // Reverse
        // sb.reverse();

        String str = sb.toString();
        System.out.println(str);



        // Generate Random String:
        int n = 10; // size of the string;
        System.out.println(RandomString.generate(n));

        // Remove whitespaces:
        String sentence = "hi, ash ish kush waha";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        String arr = "Ashish Monika Ashika Soni Sohan";
        String[] names = arr.split(" "); // wherever there is a space, it spilts from there;
        System.out.println(Arrays.toString(names));

        //Rounding off;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.2759));
        
    }
    
}
