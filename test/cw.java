package test;

public class cw {
    public static void main(String[] args) {
        printStars(17,7);
    }
    public static void printStars(int a, int b){
        if(a>0){
            insideLoop(b);
            printStars(a-1,b);
        }
    }
    public static void insideLoop(int b){
        if(b==0) System.out.println();
        else{
            System.out.print("*");
            insideLoop(b-1);
        }
    }
}
