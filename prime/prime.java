package prime;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean isPrime;
        int num;
        int loop = 1;

        while(loop==1)
        {
            isPrime = true;

            System.out.println("Enter number: ");
            num = in.nextInt();
            in.nextLine();
            
            for(int i=2;i<=(num/2);i++)
            {
                if(num%i==0) 
                {
                    isPrime = false;
                }
            }
            
            System.out.println(isPrime);

            System.out.println("Do you want to run the program again?");
            System.out.println("1.yes");
            System.out.println("2.no");
            
            int menu = in.nextInt();
            in.nextLine();
            if(menu==2) loop = 0;
        }
        in.close();
    }
}
