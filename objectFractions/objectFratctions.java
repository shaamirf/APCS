package objectFractions;
import java.util.*;
public class objectFratctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run)
        {
            int numf;
            int denomf;

            System.out.println("Enter Fraction 1 Numerator");
            numf = in.nextInt();
            in.nextLine();
            System.out.println("Enter Fraction 1 Denominator");
            denomf = in.nextInt();
            in.nextLine();

            fraction f1 = new fraction(numf,denomf);
                
            System.out.println("What operation do you want to perform?");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
            int op = in.nextInt();
            in.nextLine();

            System.out.println("Enter Fraction 2 Numerator");
            numf = in.nextInt();
            in.nextLine();
            System.out.println("Enter Fraction 2 Denominator");
            denomf = in.nextInt();
            in.nextLine();

            fraction f2 = new fraction(numf,denomf);

            if(op==1) add(f1,f2);
            if(op==2) sub(f1,f2);
            if(op==3) mult(f1,f2);
            if(op==4) div(f1,f2);

            System.out.println("Do you want to go again?\n1.Yes\n2.No");
            int cont = in.nextInt();
            in.nextLine();
            if(cont==2) run = false;
        }
        in.close();
    }
    public static void add(fraction a,fraction b)
    {
        int numf = a.getNum()*b.getDenom() + b.getNum()*a.getDenom();
        int denomf = a.getDenom()*b.getDenom();
        fraction c = new fraction(numf,denomf);
        simplify(c);
    }
    public static void sub(fraction a,fraction b)
    {
        int numf = a.getNum()*b.getDenom() - b.getNum()*a.getDenom();
        int denomf = a.getDenom()*b.getDenom();
        fraction c = new fraction(numf,denomf);
        simplify(c);
    }
    public static void mult(fraction a,fraction b)
    {
        int numf = a.getNum()*b.getNum();
        int denomf = a.getDenom()*b.getDenom();
        fraction c = new fraction(numf,denomf);
        simplify(c);
    }
    public static void div(fraction a,fraction b)
    {
        int numf = a.getNum()*b.getDenom();
        int denomf = a.getDenom()*b.getNum();
        fraction c = new fraction(numf,denomf);
        simplify(c);
    }
    public static void simplify(fraction c)
    {
        int a = c.getNum();
        int b = c.getDenom();

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
        if(a==0) System.out.println("Ans: "+0);
        else if(b==1) System.out.println("Ans: "+a);
        else System.out.println("Ans: "+a+"/"+b);
    }
    public static int abs(int a)
    {
        if(a<0) a*= -1;
        return a;
    }
}
