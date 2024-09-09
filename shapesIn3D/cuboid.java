package shapesIn3D;
public class cuboid extends rectangle{
    int depth;

    public cuboid()
    {
        super(6,5);
        depth = 4;
    }
    public cuboid(int l, int w, int d)
    {
        super(l,w);
        depth = d;
    }
    public int getDepth()
    {
        return depth;
    }
    public void setDepth(int d)
    {
        depth = d;
    }
}
