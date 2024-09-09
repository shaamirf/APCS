package sort;

public class quicksort {
    public static void main(String[] args) {
        int[]x = {6,832,5,711,4610,58,348896,234,6327,901,230,243,4564,7,3245,21,5633,47,321,568,68,325,7114,610,583488};
        int[]y = {0};
        quickSort(x,0,x.length-1,y);
        for(int i = 0; i<x.length; i++)
            System.out.print(x[i]+" ");
        System.out.println();
        System.out.println(y[0]+" Iterations");
    }
    public static int partition(int[]a, int l, int r, int[]y){
        int len = a.length;
        int pivot = a[l];
        int i = l;
        int j = r;
        while(i<j){
            while(i<len && a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<j){
                y[0]++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        y[0]++;
        int t = a[l];
        a[l] = a[j];
        a[j] = t;
        return j;
    }

    public static void quickSort(int[]a, int l, int r, int[]y){
        int j;
        if(l<r){
            j = partition(a,l,r,y);
            quickSort(a,l,j,y);
            quickSort(a,j+1,r,y);
        }
    }
}
