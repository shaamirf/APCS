package objectFractions;

public class mixedFraction {
    private int wNum;
    private fraction frac;

    public mixedFraction()
    {
        wNum = 5;
        frac = null;
    }
    public mixedFraction(int w, int n, int d)
    {
        wNum = w;
        frac = new fraction(n,d);
    }
    public mixedFraction(int w, fraction f)
    {
        wNum = w;
        frac = f;
    }
    public int getwNum()
    {
        return wNum;
    }
    public fraction getFraction()
    {
        return frac;
    }
    public void setwNum(int w)
    {
        wNum = w;
    }
    public void setFraction(fraction f)
    {
        frac = f;
    }
    public fraction getImproper()
    {
        int n = (frac.getDenom() * wNum) + frac.getNum();
        int d = frac.getDenom();
        return new fraction(n,d); 
    }
}
