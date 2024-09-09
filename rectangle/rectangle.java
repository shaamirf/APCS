package rectangle;
public class rectangle {
    private double length;
    private double width;

    public rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
// getters and setters
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setLength(double l)
    {
        length = l;
    }
    public void setWidth(double w)
    {
        width = w;
    }
//functions
    public double getArea()
    {
        return length * width;
    }
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
    public boolean isSquare()
    {
        return length == width;
    }
    public boolean isAreaEqualToPerimeter()
    {
        return getArea() == getPerimeter();
    }
}
