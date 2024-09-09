package implement;

public class Heel extends Shoe{
    private double height;

    public Heel(String b, double s, String c, double h){
        super(b,s,c);
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height = h;
    }
}
