package recursionstuff;
public class recursionpractice{
    public static void main(String[] args) {
        System.out.println(pow(3,-2));
    }
    public static void mystery(int n){
        if(n<=1)
            System.out.print(n);
        else{
            mystery(n/2);
            System.out.print(", "+n);
        }
    }
    public static void mystery2(int n){
        if(n>100)
            System.out.print(n);
        else{
            mystery2(n*2);
            System.out.print(", "+n);
        }
    }
    public static void mystery3(int n){
        if(n<=0){
            System.out.print("*");
        } else if (n%2==0){
            System.out.print("(");
            mystery3(n-1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n-1);
            System.out.print("]");
        }
    }
    public static void mystery4(int x, int y){
        if(y==1) System.out.print(x);
        else{
            System.out.print(x*y+", ");
            mystery4(x,y-1);
            System.out.print(", "+x*y);
        }
    }
    public static void doubleReverse(String s){
        if(s.length()==1)
            System.out.print(s + s);
        else{
            doubleReverse(s.substring(1,s.length()));
            String sub = s.substring(0,1);
            System.out.print(sub+sub);
        }
    }
    public static double pow(double x, double y) {
        
        if (y == 0) {
        // base case with y == 0
            return 1;
        } else if (y < 0) {
            return (1.0/x) * pow(x, y+1);
        } else {
        // recursive case with y > 0
            return x * pow(x, y - 1);
        }
    }
}