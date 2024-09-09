package bigbirds;
import java.util.*;
public class bigbirds {
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        in.nextLine();
//1
        for(int a=1;a<=lines;a++)
        {
            for(int b=1;b<=a;b++) System.out.print("X");
            System.out.println();
        }
//2
        for(int i=lines;i>0;i--) System.out.print("X");
        System.out.println();

        for(int i=lines-2;i>0;i--)
        {
            for(int j=i;j>0;j--) System.out.print(" ");
            System.out.println("X");
        }

        for(int i=lines;i>0;i--) System.out.print("X");
        System.out.println(); 
//3
       for(int c=1;c<=lines;c++)
        {
            for(int d=0;d<lines-c;d++) System.out.print(" ");
            for(int d=1;d<(2*c);d++) System.out.print("X");
            System.out.println();
        }

        in.close();
    }
}
