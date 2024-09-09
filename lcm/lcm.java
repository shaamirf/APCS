package lcm;
import java.util.*;
public class lcm {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int num1,num2,lcm;

        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 2: ");
        num2 = in.nextInt();
        in.nextLine();

        if(num1>=num2) lcm = num1;
        else lcm = num2;

        int loop = 1;
        while(loop == 1)
        {
            if((lcm%num1==0)&&(lcm%num2==0))
            {
                System.out.println(lcm);
                loop = 0;
            }
            else lcm++;
        }
        in.close();
    }
}
