package test;

public class test2 {
    public static void main(String[] args) {
        mystery1(1); System.out.println();
        mystery1(2); System.out.println();
        mystery1(3); System.out.println();
        mystery1(4); System.out.println();
        mystery1(16); System.out.println();
        mystery1(30); System.out.println();
        mystery1(100); System.out.println();


        mystery2(113);
        System.out.println();
        mystery2(70);
        System.out.println();
        mystery2(42);
        System.out.println();
        mystery2(30);
        System.out.println();
        mystery2(10);
        System.out.println();

        mysteryXY(4, 1);
        System.out.println();
        mysteryXY(4, 2);
        System.out.println();
        mysteryXY(8, 2);
        System.out.println();
        mysteryXY(4, 3);
        System.out.println();
        mysteryXY(3, 4); System.out.println();

        doubleReverse("hello"); System.out.println();
    }
    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }
    public static void mystery2(int n) {
        if (n > 100) {
            System.out.print(n);
        } else {
            mystery2(2 * n);
            System.out.print(", " + n);
        }
    }
    public static void mysteryXY(int x, int y) {
        if (y == 1) {
            System.out.print(x);
        } else {
            System.out.print(x * y + ", ");
            mysteryXY(x, y - 1);
            System.out.print(", " + x * y);
        }
    }
    public static void doubleReverse(String s){
        if(s.length()>0){
            doubleReverse(s.substring(1));
            System.out.print(s.substring(0,1)+s.substring(0,1));
        }
    }
}
