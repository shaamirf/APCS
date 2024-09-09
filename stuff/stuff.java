package stuff;
import java.util.*;
public class stuff {
    public static void main(String[] args) {
//1
        int[]even = {2,4,6,8,10,12,14,16,18,20};
        for(int num:even)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------- #1");

//2
        int[][]table = new int[10][10];
        for(int i=0; i<=9;i++){
            for(int j=0; j<=9;j++){
                table[i][j] = (i+1)*(j+1);
            }
        }
        for(int[] list:table){
            System.out.println("+----+----+----+----+----+----+----+----+----+----+");
            for(int num:list){
                if(num==100) System.out.print("| "+num); 
                else if(num<10) System.out.print("| 0"+num+" "); 
                else System.out.print("| "+num+" ");
            }
            System.out.println("|");
        }
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        System.out.println("-------------------------------------- #2");

//3
        ArrayList<Integer> evens = new ArrayList<>();
        for(int i = 2;i<21;i+=2){
            evens.add(i);
        }
        for(int num:evens){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------- #3");

//4
        int a = 1;
        ArrayList<ArrayList<Integer>> twoD = new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            twoD.add(new ArrayList<Integer>());
            for(int j=0;j<3;j++){
                twoD.get(i).add(a);
                a++;
            }
        }
        System.out.println(twoD.get(0).get(0));
        System.out.println(twoD.get(1).get(1));
        System.out.println(twoD.get(2).get(0));
        System.out.println("-------------------------------------- #4");
    }
}
