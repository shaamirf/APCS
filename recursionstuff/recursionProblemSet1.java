package recursionstuff;

public class recursionProblemSet1 {
    public static void main(String[] args) {
        System.out.println(power(5,3));
        System.out.println(power(10,5));
    }
    public static void printStars( int a ){
        if(a==1) System.out.println("*");
        else{
                for(int i = 0;i<a;i++){
                System.out.print("* ");
            }
            System.out.println();
            printStars(a-1);
        }
    }
    public static int sumOfAllDigits(int a){
        if(a==0) return 0;
        return (a%10+sumOfAllDigits(a/10));
    }
    // f(1473): 3 + f(147) = 3 + 7 + f(14)...... = 15
    public static int sum(int a, int b){
        if(b==0) return a;
        else return(sum(a+1,b-1));
    }
    //f(5,6) = f(6,5) = f(7,4) = f(8,3) .... f(11,0) = 11;
    public static int product(int a, int b){
        if(b==0) return 0;
        else return a + product(a,b-1);
    }
    // 6*5 = 6+(6*4) = 6+(6+6*3) .........
    public static int power(int a, int b){
        if(b==0) return 1;
        else return a * power(a,b-1);
    }
    // 6^5 = 6*(6^4) = 6*(6*6^3)......... 
}