package divide;
import java.util.*;
public class divide {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
         int a,b;
         int c = 0;
         int q = -1;
         
        System.out.println("Enter number 1: ");
        a = in.nextInt();
        in.nextLine();

        System.out.println("Enter number 2: ");
        b = in.nextInt();
        in.nextLine();

        while(c<=a)
        {
            c+=b;
            q++;
        }
        c-=b;
        int r = a-c;


        int q2 = 0;
        int turns = 1;
        while((r!=0) && (turns<=5))
        {
            q2 *= 10;
            c = 0;
            a = r*10;
            while(c<=a)
            {
                c+=b;
                q2++;
            }
            c-=b;
            q2-=1;
            r = a-c;
            turns += 1;
        }
        

        int q3 = 0;
        while((r!=0) && (turns<=10))
        {
            q3 *= 10;
            c = 0;
            a = r*10;
            while(c<=a)
            {
                c+=b;
                q3++;
            }
            c-=b;
            q3-=1;
            r = a-c;
            turns += 1;
        }
        System.out.println(q+"."+q2+""+q3);
        in.close();
    }
}
