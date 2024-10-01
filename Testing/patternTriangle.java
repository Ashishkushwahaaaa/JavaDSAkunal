package Testing;

public class patternTriangle {
    public static void main(String[] args) {
        // patternTriangle printpattern = new patternTriangle();
        // printpattern.pattern(5, 0);
        int a = 8;
        int b = 3;
        int c = Math.abs(b-a);
        System.out.println(c);
    }
    public void pattern(int r,int c){
        if (r==0) {
            return;
        }
        if(c<r){
            System.out.print("* ");
            pattern(r, c+1);
            return;
        }
        if (r>0) {
            System.out.println();
            pattern(r-1, 0);
            return;
        }
    }
}
