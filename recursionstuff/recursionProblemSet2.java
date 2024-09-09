package recursionstuff;

public class recursionProblemSet2{
    public static void main(String[] args) {
        System.out.println(bunnyEars(6));
        int[]a = {1,2,3,4,5,11,6,7};
        System.out.println(array11(a,0));
    }
    public static int bunnyEars(int n){
        if(n==0) return 0;
        else return (2 + bunnyEars(n-1));
    }
    public static int array11(int[]x , int i){
        if(i==x.length-1){
            if(x[i]==11) return 1;
            else return 0;
        }
        if(x[i]==11) return (1+array11(x,i+1));
        else return array11(x,i+1);
    }
}