package arrayObjects;
public class arrayObjects {
    public static void main(String[] args)
    {
//1
        int[]x = {30,11,35,23,9};
        System.out.println(arrayLocate(x,-1));
//2
        shoe[]y = {new shoe(),new shoe("Skechers",11,"Blue"),new shoe("Asics",9,"Black")};
        y[1].setBrand("Toms");
        System.out.println(y[1].getBrand());

        y[1].setSize(7);
        System.out.println(y[1].getSize());

        y[1].setColor("Gray");
        System.out.println(y[1].getColor());
//3
        System.out.println(smartSubstring("Michael",1,5));
        System.out.println(smartSubstring("Michael",-1,-4));
    }
    public static int arrayLocate(int[]a, int b)
    {
        if(b<0) return a[a.length+b];
        else return a[b];
    }
    public static String smartSubstring(String s, int a, int b)
    {
        String s1 = "";
        int len = s.length();
        if(a<0)
        {
            for(int i = a;i>=b;i--)
                s1 += s.substring(len+i,len+i+1);
        } else{
            for(int i = a;i<=b;i++)
                s1 += s.substring(i-1,i);
        }
        return s1;
    }
}
