package footwear;
public class sock {
    private double size;
    private String color;
//constructors
    //default
    public sock()
    {
        size = 10;
        color = "White";
    }
    //custom
    public sock(double s, String c)
    {
        size = s;
        color = c;
    }
//getters
    public double getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
//setters
    public void setSize(double s)
    {
        size = s;
    }
    public void setColor(String c)
    {
        color = c;
    }
}
