package boba;
import java.util.*;
public class mainFile {
    public static void main(String[] args) {
        drink[]drinks = new drink[3];
        drinks[0] = new drink();
        drinks[1] = new drink("milk tea", 30, 40);
        drinks[2] = new drink("black tea", 10, 70); 

        boba[]bobas = new boba[3];
        ArrayList<String>topping = new ArrayList<String>();
        topping.add("boba");

        bobas[0] = new boba();
        bobas[1] = new boba("coffee", 30, 40, topping);
        bobas[2] = new boba("black tea", 10, 70, topping); 

        bobas[1].setType("Jasmine Milk Tea");
        bobas[1].setIce(50);
        bobas[1].setSweetness(30);

        bobas[1].setTopping(1,"pudding");

        System.out.println(bobas[1]);
    }
}
    
