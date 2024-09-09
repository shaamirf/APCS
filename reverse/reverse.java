package reverse;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rnum = 0;

        while(num>0)
        {
            rnum *= 10;
            rnum += (num%10);
            num/=10;
        }
        System.out.println(rnum);
        in.close();
    }
}