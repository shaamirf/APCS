package evil6s;
import java.util.*;
public class evil6s
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();

        int newnum = 0;
        int tens = 1;

        while(num>0)
        {
            if(num%10 != 6)
            {
                newnum += (tens*(num%10));
                tens*=10;
            }
            num/=10;
        }
        System.out.println(newnum);
        in.close();
    }
}