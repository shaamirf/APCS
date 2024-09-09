package divide;
import java.util.*;
public class divide2 {
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
        System.out.print(q);
        c-=b;
        int r = a-c;
        if(r>0) System.out.print(".");

        int i = 1;
        
        while((r!=0) && (i<=10))
        {
            q = 0;
            c = 0;
            a = r*10;
            while(c<=a)
            {
                c+=b;
                q++;
            }
            c-=b;
            q-=1;
            r = a-c;
            i++;
            System.out.print(q);
        }
        System.out.print("\n");
        in.close();
    }
}
