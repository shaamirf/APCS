package boba;
import java.util.*;
public class boba extends drink{
    private ArrayList<String>toppings;

    public boba(){
        super();
        toppings = new ArrayList<>();
    }

    public boba(String t, int i, int s,ArrayList<String>to){
        super(t,i,s);
        toppings = to;
    }

    public String getTopping(int i){
        return toppings.get(i);
    }
    public void setTopping(int i, String s){
        if(i==toppings.size()) toppings.add(s);
        else toppings.set(i,s);
    }

    public String toString(){
        String a = "type: "+getType()+", ice: "+getIce()+"%, sweetness: "+getSweetness()+" %, toppings: ";
        for(String s:toppings){
            a = a + s + ", ";
        }
        return a;
    }
}
