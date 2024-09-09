package evenStevens;
import java.util.*;
public class evenStevens {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Number 1:");
        int num1 = in.nextInt();
        in.nextLine();

        System.out.println("Enter Number 2:");
        int num2 = in.nextInt();
        in.nextLine();

        System.out.println("Enter Number 3:");
        int num3 = in.nextInt();
        in.nextLine();

        int sum = (num1+num2+num3);
        if(sum%3==0)
            {
                if((sum/3)==num1 || (sum/3)==num2 || (sum/3)==num3)
                    System.out.println("hella lit");
            }
        in.close();

        /*
        if(num1<=num2 && num1<=num3)
        {
            small = num1;
            if(num2<=num3)
            {
                medium = num2;
                large = num3;
            }
            else
            {
                medium = num3;
                large = num2;
            }
        }
        else if(num2<=num1 && num2<=num3)
        {
            small = num2;
            if(num1<=num3)
            {
                medium = num1;
                large = num3;
            }
            else
            {
                medium = num3;
                large = num1;
            }
        }
        else
        {
            small = num3;
            if(num1<=num2)
            {
                medium = num1;
                large = num2;
            }
            else
            {
                medium = num2;
                large = num1;
            }
        }
        if(absoluteValue(large-medium)==absoluteValue(medium-small)) System.out.println("hella lit");
        in.close();
        */
    }
/*
    public static int absoluteValue(int x)
    {
        if(x<0) x*=1;
        return x;
    }
*/
}
