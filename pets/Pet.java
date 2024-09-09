package pets;

public class Pet {
    private String name;
    private String sound;

    public Pet(String n){
        name = n;
        sound = "no sound";
    }

    public String getName(){
        return name;
    }

    public String getSound(){
        return sound;
    }

    public void setName(String n){
        name = n;
    }

    public void setSound(String s){
        sound = s;
    }

    public String toString(){
        return "name: " + name + ", sound: " + sound;
    }
}
