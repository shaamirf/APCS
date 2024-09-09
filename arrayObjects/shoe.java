package arrayObjects;
public class shoe {
    private String brand;
    private double size;
    private String color;

//constructors
    //default
    public shoe()
    {
        brand = "Nike";
        size = 10;
        color = "White";
    }
    //custom
    public shoe(String b, double s, String c)
    {
        brand = b;
        size = s;
        color = c;
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
}

