package footwear;
public class footwear {
    public static void main(String[] args){
        
        sock x = new sock(11,"Black");

        shoe b = new shoe("Skechers",12,"Blue",x);

        b.getSockies().setColor("Brown");
        System.out.println(b.getSockies().getColor());
    }
}
