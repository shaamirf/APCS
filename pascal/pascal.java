package pascal;
import java.util.*;
public class pascal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");

        int a = in.nextInt();
        in.nextLine();
        in.close();

        pasc(a);
    }
    public static void pasc(int n)
    {
        //holds values for "previous line" 
        int[]x = new int[n];

        for(int i=1;i<=n;i++)
        {
            //holds values for "current line"
            int[]y = new int[i];
            for(int j=0;j<i;j++)
            {
                //first and last values are 1
                if(j==0||j==i-1)
                {
                    y[j] = 1;
                } else {
                    y[j] = x[j] + x[j-1];
                }
            }
            //updates values for x array, becomes the "previous line" after iteration
            for(int k=0;k<i;k++)
            {
                x[k] = y[k];
                System.out.print(x[k]+" ");
            }
            System.out.println();
        }
    }    
}
