package bricks;
import java.util.*;
public class bricks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        in.nextLine();
        int num2 = in.nextInt();
        in.nextLine();
        int num3 = in.nextInt();
        in.nextLine();

        makeBricks(num1,num2,num3);
        in.close();
    }
    public static void makeBricks(int small, int big, int goal)
    {
        int bricks = goal - big*5;
        if(bricks<0) bricks = goal%5;
        System.out.println(small>bricks);
    }
}
