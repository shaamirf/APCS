package shapesIn3D;
public class rectangle {
    private int length;
    private int width;

    public rectangle()
    {
        length = 5;
        width = 3;
    }
    public rectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public void setLength(int l)
    {
        length = l;
    }
    public void setWidth(int w)
    {
        width = w;
    }
    public String toString()
    {
        return "Length: "+length+", Width: "+width+".";
    }
}

