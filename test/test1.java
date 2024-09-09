package test;

public class test1 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int x){
        if(x<1)
            return 1;
        else  
            return f(x-1)+g(x);
    }
    public static int g(int x){
        if(x<2)
            return 2;
        else
            return f(x-1)+g(x/2);
    }
}
