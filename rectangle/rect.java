package rectangle;
public class rect {
    public static void main(String[] args) {
        rectangle r = new rectangle(5,7);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.isSquare());
        System.out.println(r.isAreaEqualToPerimeter());
    }
}
