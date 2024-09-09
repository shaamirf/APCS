package tres;
import java.util.*;
public class tres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();

        boolean isTriple = false;
        while(num>100)
        {
            if((num%10)==previousDigit(num,1) && (num%10)==previousDigit(num,2))
                isTriple = true;
            num/=10;
        }
        if(isTriple == false) System.out.println("no");
        if(isTriple == true) System.out.println("yes");
        in.close();
    }

    public static int previousDigit(int x, int times)
    {
        int y = 0;
        for(int i=0;i<times;i++)
        {
            x/=10;
            y = x%10;
        }
        return y;
    }
}
