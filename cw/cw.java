package cw;
import java.util.*;
public class cw {
    public static void main(String[] args) 
    {
//1
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();

        if(num>=100)  
        {
            num /= 100;
            System.out.println(num%10);
        }
        else System.out.println("No number");
//2
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
//3
        for(int i = 1; i < 6; i++)
        {
            for(int j = 0; j < (5-i); j++) System.out.print(" ");
            for(int k = 0; k < i; k++) System.out.print(i);
            System.out.println();
        }
        in.close();
    }
}