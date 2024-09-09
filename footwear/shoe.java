package footwear;
public class shoe {
    private String brand;
    private double size;
    private String color;
    private sock sockies;

//constructors
    //default
    public shoe()
    {
        brand = "Nike";
        size = 10;
        color = "White";
        sockies = new sock();
    }
    //custom
    public shoe(String b, double s, String c, sock so)
    {
        brand = b;
        size = s;
        color = c;
        sockies = so;
    }
//getters
    public String getBrand()
    {
        return brand;
    }
    public double getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
    public sock getSockies()
    {
        return sockies;
    }
//setters
    public void setBrand(String b)
    {
        brand = b;
    }
    public void setSize(double s)
    {
        size = s;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setSockies(sock so)
    {
        sockies = so;
    }
}
