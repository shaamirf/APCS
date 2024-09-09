package calculator;
import java.util.*;
public class calculator {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Shaamir's calculator");

        while(true)
        {
            int op, num1, num2;
            
            System.out.println("Which operation do you want to perform? Pick a #");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division w/ remainder");

            op = in.nextInt();
            in.nextLine();

            System.out.println("Enter number 1: ");
            num1 = in.nextInt();
            in.nextLine();

            System.out.println("Enter number 2: ");
            num2 = in.nextInt();
            in.nextLine();

            if(op == 1) System.out.println(num1+num2);
            if(op == 2) System.out.println(num1-num2);
            if(op == 3) System.out.println(num1*num2);
            if(op == 4) System.out.println("Quotient: "+(num1/num2)+", Remainder: "+(num1%num2));

            int menu2;
            System.out.println("Do you want to run another calculation? pick a #");
            System.out.println("1. yes");
            System.out.println("2. no");
            menu2 = in.nextInt();
            in.nextLine();

            if(menu2==2) break;
        }
        in.close();   
    }
}
