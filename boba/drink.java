package boba;

public class drink {
    private String type;
    private int ice;
    private int sweetness;

    public drink()
    {
        type = "tea";
        ice = 20;
        sweetness = 60;
    }

    public drink(String t, int i, int s)
    {
        type = t;
        ice = i;
        sweetness = s;
    }

    public String getType(){
        return type;
    }
    public int getIce(){
        return ice;
    }
    public int getSweetness(){
        return sweetness;
    }

    public void setType(String t){
        type = t;
    }
    public void setIce(int i){
        ice = i;
    }
    public void setSweetness(int s){
        sweetness = s;
    }   

    public String toString(){
        return "type: "+type+", ice: "+ice+"%, sweetness: "+sweetness+" %.";
    }
}
