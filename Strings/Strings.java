package Strings;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String:");
        String s = in.nextLine();
        in.close();

        System.out.println(flip(s));
        System.out.println(removeDuplicates(s));
    }
    public static String flip(String a)
    {
        String b = "";
        for(int i=a.length()-1; i>=0 ; i--)
        {
            b += a.substring(i,i+1);
        }
        return b;
    }
    public static String removeDuplicates(String a)
    {
        int len = a.length()-1;
        String b = "";
        for(int i=0; i<len; i++)
        {
            if(!a.substring(i,i+1).equals(a.substring(i+1,i+2)))
            {
                b+= a.substring(i,i+1);
            }
        }
            b += a.substring(len);
        return b;
    }
}
