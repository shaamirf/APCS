package arrayPractice;
import java.util.*;
public class arrayPractice {
    public static void main(String[] args) {
        //1
        int[]arr1 = {1, 3, 1, 4, 4, 3, 1}; 
        printArray(fix34(arr1));
        System.out.println("--------------------------------------^#1");

        //2
        int[]arr2 = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(arr2));
        System.out.println("--------------------------------------^#2");

        //3
        String[]key1 = {"a", "a", "b", "b"};
        String[]answer1 = {"a", "?", "b", "c"};
        System.out.println(scoreUp(key1,answer1));
        System.out.println("--------------------------------------^#3");

    }

    public static int[] fix34(int[]a){
        ArrayList<Integer> fours = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(a[i]==4)
                fours.add(i);
        }

        int x = 0;
        int temp;

        for(int i=0;i<a.length;i++){
            if(a[i]==3){
                temp = a[i+1];
                a[i+1] = 4;
                a[fours.get(x)] = temp;
                x++;
            }
        }
        return a;
        //{1,3,1,4,4,3,1}  -->  {1,3,4,1,4,3,1} --> {1,3,4,1,4,3,1}
    }
    public static int countClumps(int[]a){
        int len = a.length;
        int streak = 1;
        int clumps = 0;
        for(int i=1;i<len;i++){
            if(a[i]==a[i-1]){
                streak++;
            } else {
                if(streak>1) clumps++;
                streak = 1;
            }
        }
        if(a[len-1]==a[len-2]) clumps++;

        return clumps;
    }

    public static int scoreUp(String[] key, String[] answers){
        int len = key.length;
        int score = 0;
        for(int i=0;i<len;i++){
            if(answers[i].equals(key[i])) score += 4;
            else if(!answers[i].equals("?")) score -= 1;
        }
        return score;
    }

    public static void printArray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
