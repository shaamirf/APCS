package smartArrays;
public class smartArrays {
    public static void main(String[] args)
    {
        //test cases for all functions
        int[]x = {1,2,3,4,5,6};
        int[]a = add(x,10);
        int[]b = add(x,3,10);
        int[]c = remove(x);
        int[]d = remove(x,2);
        int[]e = replace(x,0,10);

        printArray(a);
        printArray(b);
        printArray(c);
        printArray(d);
        printArray(e);

        System.out.println(indexOf(x,5));
    }
    public static int[] add(int[]a,int value)
    {
        int len = a.length;
        int[]b = new int[len+1];
        for(int i=0;i<len;i++)
            b[i] = a[i];
        b[len] = value;
        return b;
    }
    public static int[] add(int[]a,int spot,int value)
    {
        int len = a.length;
        int[]b = new int[len+1];
        for(int i=0;i<spot;i++)
            b[i] = a[i];
        b[spot] = value;
        for(int i = spot+1;i<=len;i++)
            b[i] = a[i-1];
        return b;
    }
    public static int[] remove(int[]a)
    {
        int len = a.length;
        int[]b = new int[len-1];
        for(int i=0;i<len-1;i++)
            b[i] = a[i];
        return b;
    }
    public static int[] remove(int[]a, int spot)
    {
        int len = a.length-1;
        int[]b = new int[len];
        for(int i=0;i<spot;i++)
            b[i] = a[i];
        for(int i = spot;i<len;i++)
            b[i] = a[i+1];
        return b;
    }
    public static int[] replace(int[]a, int spot, int value)
    {
        int len = a.length;
        int[]b = new int[len];
        for(int i=0;i<spot;i++)
            b[i] = a[i];
        b[spot] = value;
        for(int i = spot+1;i<len;i++)
            b[i] = a[i];
        return b;
    }
    public static int indexOf(int[]a, int value)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==value) 
                return i;
        }
        return -1;
    }
    public static void printArray(int[]a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
