package sort;

public class sorts {
    public static void main(String[] args) {
        int[]x = {6,832,5,711,4610,58,348896,234,6327,901,230,243,4564,7,3245,21,5633,47,321,568,68,325,7114,610,583488};
        smartBubblesort(x);
        for(int i = 0; i<x.length; i++)
            System.out.print(x[i]+" ");
        System.out.println();

        int[]y = {6,832,5,711,4610,58,348896,234,6327,901,230,243,4564,7,3245,21,5633,47,321,568,68,325,7114,610,583488};
        insertionSort(y);
        for(int i = 0; i<y.length; i++)
            System.out.print(y[i]+" ");
        System.out.println();

        int[]z = {6,832,5,711,4610,58,348896,234,6327,901,230,243,4564,7,3245,21,5633,47,321,568,68,325,7114,610,583488};
        selectionSort(z);
        for(int i = 0; i<z.length; i++)
            System.out.print(z[i]+" ");
        System.out.println();
        System.out.println("Comparing the three methods for the same list, Insertion Sort appears most efficient while Bubble Sort appears least efficient");
    }
    public static void smartBubblesort(int[]a){
        int len = a.length;
        boolean run = true;
        int y = 0;
        while(run)
        {
            run = false;
            for(int i = 0; i<len-1; i++)
            {
                y++;
                if(a[i]>a[i+1])
                {
                    run = true;
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp; 
                }
            }
        }

        //number of iterations
        System.out.println(y+" Iterations");
    }
    public static void insertionSort(int[]a){
        int iterations = 0;
        for(int i=1;i<a.length;i++){
            int temp = a[i];
            int j = 1;
            while(i-j>=0 && temp<=a[i-j]){
                iterations++;
                a[i-j+1] = a[i-j];
                j++;
            }
            a[i-j+1] = temp;
        }
        System.out.println(iterations+" Iterations");
    }
    public static void selectionSort(int[]a){
        int len = a.length;
        boolean run = true;
        int index = 0;
        int iterations = 0;

        while(run){
            run = false;
            for(int i=0;i<len-1;i++){
                if(a[i]>a[i+1]) run = true;
            }
            if(run){
                int index2 = len-1;
                int min = Integer.MAX_VALUE;
                for(int j=index;j<len;j++){
                    iterations++;
                    if(a[j]<min){
                        min = a[j];
                        index2 = j;
                    }
                }
                a[index2] = a[index];
                a[index] = min;
                index++;
            }
        }
        System.out.println(iterations+" iterations");
    }
}
