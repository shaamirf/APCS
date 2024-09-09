package frylau;
import java.util.*;
public class frylau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 3:");
        int num3 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 4:");
        int num4 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 5:");
        int num5 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 6:");
        int num6 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number 7:");
        int num7 = in.nextInt();
        in.nextLine();

        mean(num1,num2,num3,num4,num5,num6,num7);
        median(num1,num2,num3,num4,num5,num6,num7);
        mode(num1,num2,num3,num4,num5,num6,num7);
        in.close();
    }
    public static void mean(int a, int b, int c, int d, int e, int f, int g){
        int h = a+b+c+d+e+f+g;
        System.out.println("Mean: "+(h/7.0));
    }
    public static void median(int a, int b, int c, int d, int e, int f, int g)
    {
        while( a>b || b>c || c>d || d>e || e>f ||f>g)
        {
            if(a>b)
            {
                a += b;
                b = a-b;
                a -= b;
            }
            if(b>c)
            {
                b += c;
                c = b-c;
                b -= c;
            }
            if(c>d)
            {
                c += d;
                d = c-d;
                c -= d;
            }
            if(d>e)
            {
                d += e;
                e = d-e;
                d -= e;
            }
            if(e>f)
            {
                e += f;
                f = e-f;
                e -= f;
            }
            if(f>g)
            {
                f += g;
                g = f-g;
                f -= g;
            }
        }

        System.out.println("Median: "+ d);   
    }
    public static void mode(int a, int b, int c, int d, int e, int f, int g)
    {
        int mode = -1;
        int a_count = count(a,b,c,d,e,f,g);
        int b_count = count(b,a,c,d,e,f,g);
        int c_count = count(c,a,b,d,e,f,g);
        int d_count = count(d,a,b,c,e,f,g);
        int e_count = count(e,a,b,c,d,f,g);
        int f_count = count(f,a,b,c,d,e,g);
        int g_count = count(g,a,b,c,d,e,f);

        int mode1 = 1;
        int mode2 = 1;
        int mode3 = 1;

        if(a_count > 1 || b_count > 1 || c_count > 1 || d_count > 1 || e_count > 1 || f_count > 1 || g_count > 1)
        {
            mode = a_count;
            mode1 = a;

            if(b_count>mode) 
            {
                mode1 = b;
                mode = b_count;
            }
            else if(b_count==mode && b!=mode1) mode2 = b;

            if(c_count>mode)
            {
                mode1 = c;
                mode = c_count;
                mode2 = 1;
            }
            else if(c_count==mode && c!=mode1 && c!=mode2)
            {
                if(mode2==1) mode2 = c;
                else mode3 = c;
            }

            if(d_count>mode)
            {
                mode1 = d;
                mode = d_count;
                mode2 = 1;
                mode3 = 1;
            }
            else if(d_count==mode && d!=mode1 && d!=mode2)
            {
                if(mode2==1) mode2 = d;
                else mode3 = d;
            }

            if(e_count>mode)
            {
                mode1 = e;
                mode = e_count;
                mode2 = 1;
                mode3 = 1;
            }
            else if(e_count==mode && e!=mode1 && e!=mode2)
            {
                if(mode2==1) mode2 = e;
                else mode3 = e;
            }

            if(f_count>mode)
            {
                mode1 = f;
                mode = f_count;
                mode2 = 1;
                mode3 = 1;
            }
            else if(f_count==mode && f!=mode1 && f!=mode2)
            {
                if(mode2==1) mode2 = f;
                else mode3 = f;
            }

            if(g_count>mode)
            {
                mode1 = g;
                mode = g_count;
                mode2 = 1;
                mode3 = 1;
            }
            else if(g_count==mode && g!=mode1 && g!=mode2)
            {
                if(mode2==1) mode2 = g;
                else mode3 = g;
            }

            System.out.print("Mode/Modes: "+mode1);
            if(mode2!=1) System.out.print(", "+mode2);
            if(mode3!=1) System.out.print(", "+mode3);
            System.out.println();
        }
        else System.out.println("No mode");
    }

    public static int count(int a, int b, int c, int d, int e, int f, int g)
    {
        int count = 1;
        if(a==b) count++;
        if(a==c) count++;
        if(a==d) count++;
        if(a==e) count++;
        if(a==f) count++;
        if(a==g) count++;
        return count;
    }
}