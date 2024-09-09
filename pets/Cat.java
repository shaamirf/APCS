package pets;

public class Cat extends Pet {
    private int numberOfLives;

    public Cat(String n, int num){
        super(n);
        setSound("meow");
        numberOfLives = num;
    }

    public void reduceLives(){
        numberOfLives--;
    }

    public String toString(){
        return "name: " + getName() + ", sound: " + getSound() + ", number of lives: " + numberOfLives;
    }
}
