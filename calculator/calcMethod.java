package calculator;
import java.util.*;
public class calcMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Shaamir's calculator");

        System.out.println("Which operation do you want to perform? Pick a #");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int op = in.nextInt();
            in.nextLine();

        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        in.nextLine();

        in.close();
        if(op == 1) System.out.println(add(num1,num2));
        if(op == 2) System.out.println(subtract(num1,num2));
        if(op == 3) System.out.println(multiply(num1,num2));
        if(op == 4) divide(num1,num2);
    }

    public static int add(int a,int b){
        return (a+b);
    }
    public static int subtract(int a,int b){
        return (a-b);
    }
    public static int multiply(int a,int b){
        return (a*b);
    }
    public static void divide(int a,int b){
        double c = b;
        System.out.println(a/c);
    }
}
