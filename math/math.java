package math;
import java.util.*;

public class math {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int menu = 1;
        while (menu == 1)
        {
            
            int num1;
            int num2;
            int denom1;
            int denom2;
            String op;
            
            System.out.println("Enter numerator 1: ");
            num1 = in.nextInt();
            in.nextLine();
            System.out.println("Enter denominator 1: ");
            denom1 = in.nextInt();
            in.nextLine();
    
            System.out.println("Enter operation: ");
            op = in.nextLine();
    
            System.out.println("Enter numerator 2: ");
            num2 = in.nextInt();
            in.nextLine();
            System.out.println("Enter denominator 2: ");
            denom2 = in.nextInt();
            in.nextLine();
    
            if (op.equals("+")) System.out.println("The sum is: " + (num1*denom2 + num2*denom1) + "/" + denom1*denom2);
            else if (op.equals("-")) System.out.println("The difference is: " + (num1*denom2 - num2*denom1) + "/" + denom1*denom2);
            else if (op.equals("*")) System.out.println("The product is: " + (num1*num2) + "/" + (denom1*denom2));
            else if (op.equals("/")) System.out.println("The quotient is: " + (num1*denom2) + "/" + (denom1*num2));
            else System.out.println("invalid operation");
            
            

            int menu2 = 1;
            while (menu2  == 1)
            {
                String ans;
                System.out.println("Go again? (yes/no) ");
                ans = in.nextLine();
                if(ans.equals("no")) 
                {
                    menu = 0;
                    menu2 = 0;
                }
                else if(ans.equals("yes")) menu2 = 0;

                else 
                {
                    System.out.println("Invalid operation");
                }
            }
        }
        in.close();
        /*Scanner in = new Scanner(System.in);
        
        double x1;
        double x2;
        double y1;
        double y2;

        System.out.println("Enter x1 coordinate: ");
        x1 = in.nextDouble();
        in.nextLine();
        System.out.println("Enter y1 coordinate: ");
        y1 = in.nextDouble();
        in.nextLine();
        System.out.println("Enter x2 coordinate: ");
        x2 = in.nextDouble();
        in.nextLine();
        System.out.println("Enter y2 coordinate: ");
        y2 = in.nextDouble();
        in.nextLine();

        double slope;
        slope = (y2-y1)/(x2-x1);
        
        double b;
        b = y1 - (slope*x1);
        in.close();
        if (b<0)
        {
            System.out.println("Equation: y="+slope+"x"+b); 
        }
        if (b>0)
        {
            System.out.println("Equation: y="+slope+"x+"+b);
        }
        if (b==0)
        {
            System.out.println("Equation: y="+slope+"x");
        }*/
    }
}
