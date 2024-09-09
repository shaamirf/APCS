package squareroot;

public class MathMethods {

    public static int sum(int a, int b){
        return a+b;
    }

    public static void sqrt(int a){
        int outsideRoot = 1;
        int insideRoot = 1;
        int temp = 2;

        while(a>1){
            if(a%(temp*temp)==0){
                outsideRoot*=temp;
                a/=(temp*temp);
                temp = 2;
            } else if (a%temp==0) {
                insideRoot*=temp;
                a/=temp;
                temp++;
            } else temp++;
        }

        //printing
        if(insideRoot==1) System.out.println(outsideRoot);
        else if(outsideRoot==1) System.out.println("root "+insideRoot);
        else System.out.println(outsideRoot+" root "+insideRoot);
    }
}
