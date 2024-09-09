package arraySorter;
import java.util.*;
public class arraySorter 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many integers?");
        int count = in.nextInt();
        in.nextLine();

        int[]sorter = new int[count];

        for(int i=0;i<count;i++)
        {
            System.out.println("Enter Number "+(i+1)+":");
            sorter[i] = in.nextInt();
            in.nextLine();
        }
        in.close();

        for(int j=0;j<count;j++)
        {
            for(int k=0;k<count-1;k++)
            {
                if(sorter[k]>sorter[k+1])
                {
                    sorter[k] += sorter[k+1];
                    sorter[k+1] = sorter[k]-sorter[k+1];
                    sorter[k] -= sorter[k+1];
                }
            }
        }

        System.out.print(sorter[0]);
        for(int i=1;i<count;i++)
            System.out.print(","+sorter[i]);
        System.out.println();
    }
}
