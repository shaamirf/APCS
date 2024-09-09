package arrayFractions;
import java.util.*;
public class arrayFractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run)
        {
            int[]frac1 = new int[2];
            int[]frac2 = new int[2];
            int op = 0;

            System.out.println("Enter Fraction 1 Numerator");
            frac1[0] = in.nextInt();
            in.nextLine();
            System.out.println("Enter Fraction 1 Denominator");
            frac1[1] = in.nextInt();
            in.nextLine();

            System.out.println("What operation do you want to perform?");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
            op = in.nextInt();
            in.nextLine();

            System.out.println("Enter Fraction 2 Numerator");
            frac2[0] = in.nextInt();
            in.nextLine();
            System.out.println("Enter Fraction 2 Denominator");
            frac2[1] = in.nextInt();
            in.nextLine();

            if(op==1) add(frac1,frac2);
            if(op==2) sub(frac1,frac2);
            if(op==3) mult(frac1,frac2);
            if(op==4) div(frac1,frac2);

            System.out.println("Do you want to go again?\n1.Yes\n2.No");
            int cont = in.nextInt();
            in.nextLine();
            if(cont==2) run = false;
        }
        in.close();
    }
    public static void add(int[]a,int[]b)
    {
        int[]c = new int[2];
        c[0] = a[0]*b[1] + b[0]*a[1];
        c[1] = a[1]*b[1];
        simplify(c);
    }
    public static void sub(int[]a,int[]b)
    {
        int[]c = new int[2];
        c[0] = a[0]*b[1] - b[0]*a[1];
        c[1] = a[1]*b[1];
        simplify(c);
    }
    public static void mult(int[]a,int[]b)
    {
        int[]c = new int[2];
        c[0] = a[0]*b[0];
        c[1] = a[1]*b[1];
        simplify(c);
    }
    public static void div(int[]a,int[]b)
    {
        int[]c = new int[2];
        c[0] = a[0]*b[1];
        c[1] = a[1]*b[0];
        simplify(c);
    }
    public static void simplify(int[]x)
    {
        int a = x[0];
        int b = x[1];

        int max_gcf;
        if(abs(a)>abs(b)) max_gcf = abs(b);
        else max_gcf = abs(a);
        
        int gcf = 2;
        while(gcf<max_gcf)
        {
            if(a%gcf==0 && b%gcf==0)
            {
                a/=gcf;
                b/=gcf;
                gcf = 2;
            }
            else gcf++;
        }
        if(b==1) System.out.println("Ans: "+a);
        else System.out.println("Ans: "+a+"/"+b);
    }
    public static int abs(int a)
    {
        if(a<0) a*= -1;
        return a;
    }
}
