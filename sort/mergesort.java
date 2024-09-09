package sort;

public class mergesort {
    public static void main(String[] args) {
        int[]x = {6,832,5,711,4610,58,348896,234,6327,901,230,711,243,4564,7,3245,21,5633,47,321,568,68,325,7114,610,583488};
        mergeSort(x, 0, x.length-1);
        for(int i = 0; i<x.length; i++)
            System.out.print(x[i]+" ");
    }
    public static void mergeSort(int[]a, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1, r);
            merge(a,l,mid,r);
        }
    }
    public static void merge(int[]a, int l, int mid, int r){
        //merge within single array using temporary array
        int i = l;
        int j = mid+1;
        int[]b = new int[r-l+1];
        int k = 0;
        while(i<=mid && j<=r){
            if(a[i]<a[j])
                b[k++] = a[i++];
            else
                b[k++] = a[j++];
        }
        while(i<=mid)
            b[k++] = a[i++];
        while(j<=r)
            b[k++] = a[j++];

        k = 0;
        i = l;
        while(i<=r){
            a[i++] = b[k++];
        }
    }
}
