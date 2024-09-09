package binary;

public class binary {
    public static void main(String[] args) {
        int[]x = {2,7,134,235,453,457,532,4675,4768,5367,234256,2456456};
        System.out.println(binarySearch(x,234256));
    }
    public static boolean binarySearch(int[]a,int n){
        int l = 0;
        int r = a.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid]==n) return true;
            if(n>a[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}
