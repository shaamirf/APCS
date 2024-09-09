package pets;

public class Dog extends Pet {
    private String breed;

    public Dog(String n, String b){
        super(n);
        setSound("ruff");
        breed = b;
    }

    public String getBreed(){
        return breed;
    }

    public String toString(){
        return "name: " + getName() + ", sound: " + getSound() + ", breed: " + breed;
    }
}
