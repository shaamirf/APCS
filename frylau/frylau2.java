package frylau;
import java.util.*;
public class frylau2 {
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
        int[]med = {a,b,c,d,e,f,g};
        for(int j=0;j<7;j++)
        {
            for(int k=0;k<6;k++)
            {
                if(med[k]>med[k+1])
                {
                    med[k] += med[k+1];
                    med[k+1] = med[k]-med[k+1];
                    med[k] -= med[k+1];
                }
            }
        }
        System.out.println("Median: "+ med[3]);  
    }
    public static void mode(int a, int b, int c, int d, int e, int f, int g)
    {
        int[]mod = {a,b,c,d,e,f,g};
        int[]count = new int[7];

        count[0] = count(a,b,c,d,e,f,g);
        count[1] = count(b,a,c,d,e,f,g);
        count[2] = count(c,a,b,d,e,f,g);
        count[3] = count(d,a,b,c,e,f,g);
        count[4] = count(e,a,b,c,d,f,g);
        count[5] = count(f,a,b,c,d,e,g);
        count[6] = count(g,a,b,c,d,e,f);

        int mode = -1;
        int mode1 = 1;
        int mode2 = 1;
        int mode3 = 1;

        boolean y = false;
        for(int x:count)
            if(x>1) y=true;

        if(y)
        {
            for(int i=0;i<7;i++)
            {
                if(count[i]>mode)
                {
                    mode = count[i];
                    mode1 = mod[i];
                    mode2 = 1;
                    mode3 = 1;
                }
                else if(count[i]==mode && mod[i]!=mode1 && mod[i]!=mode2)
                {
                    if(mode2==1) mode2 = mod[i];
                    else mode3 = mod[i];
                }
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
