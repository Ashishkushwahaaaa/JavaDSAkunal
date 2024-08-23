package Recursion.String;

public class SkipSubstring {
    public static void main(String[] args) {

        //Method 1: Changing the string by passing the intermediate ans string in the argument;
        skip("", "Ashikanta");

        //Method 2: changing the string by creating new variable in the body of the function call and Returning the string;
        System.out.println(skip2("ashikanta")); 

        //Skip when the substring is apple(any defined string)  
        System.out.println(skipApple("bccappledf"));

        //Skip when the substring is app and not leading to apple(i.e. "app" is not followed by "le").
        System.out.println(skipAppNotApple("bccappledapplgf"));
    }
    static void skip(String p, String up){
        if (up=="") {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a' || ch== 'A') {
            skip(p, up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String up){
        if (up=="") {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return ""+skip2(up.substring(1));
        }else{
            return ch + skip2(up.substring(1));
        }
    }
    
    //Skiping string and not only a character;
    static String skipApple(String up){
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return ""+skipApple(up.substring(5));
        }else{
            return ch + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("app")&& !(up.startsWith("apple"))) {
            return "" + skipAppNotApple(up.substring(3));
        }else{
            return ch + skipAppNotApple(up.substring(1));
        }
    }
    
}
