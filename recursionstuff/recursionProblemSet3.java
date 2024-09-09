package recursionstuff;

public class recursionProblemSet3 {
    public static void main(String[] args) {
        mountain(6);
        printNum(10);
        Binary(15);
    }
    public static void mountain(int n){
        if(n==1) 
            System.out.println("*");
        else{
            for(int i = 0;i<n;i++) System.out.print("*");
            System.out.println();
            mountain(n-1);
            for(int i = 0;i<n;i++) System.out.print("*");
            System.out.println();
        }
    }
    public static void printNum(int n){
        if(n==1) System.out.print(1);
        else{
            printNum(n-1);
            System.out.print(","+n);
        }
    }
    public static void Binary (int n){
        if(n==1) System.out.print(1);
        else{
            Binary(n/2);
            System.out.print(n%2);
        }
    }
}
