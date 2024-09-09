package shapesIn3D;
public class shape {
    public static void main(String[] args) {
        cuboid c = new cuboid();
        printCuboid(c);
        System.out.println(c);

        cuboid d = new cuboid(8,7,5);
        printCuboid(d);

        d.setLength(15);
        d.setWidth(12);
        d.setDepth(10);
        printCuboid(d);
        System.out.println(d);


    }
    public static void printCuboid(cuboid x)
    {
        System.out.println(x.getLength());
        System.out.println(x.getWidth());
        System.out.println(x.getDepth());
    }
}
