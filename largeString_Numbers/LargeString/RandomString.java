package largeString_Numbers.LargeString;

import java.util.Random;

public class RandomString {
    static String generate(int size){
        StringBuffer sb = new StringBuffer(size); //Creating StringBuffer over String is efficient as it will not create new object each time a new char is appended;

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            char randomChar = (char)(97 + (random.nextFloat() * 26));
            sb.append(randomChar);
        }
        return sb.toString();
        // return sb; //To return make the method return type to StringBuffer;
    }
}
