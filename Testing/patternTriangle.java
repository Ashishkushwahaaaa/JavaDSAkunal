package Testing;

public class patternTriangle {
    public static void main(String[] args) {
        patternTriangle printpattern = new patternTriangle();
        printpattern.pattern(5, 0);
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
