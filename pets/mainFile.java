package pets;

public class mainFile {
    public static void main(String[] args) {
        Pet[]petList = new Pet[2];

        Dog d = new Dog("Romeo","Samoyed");
        Cat c = new Cat("Juliet", 4);

        petList[0] = d;
        petList[1] = c;

        // methods that work
        System.out.println(petList[0].getName());
        System.out.println(petList[0].getSound());

        System.out.println(petList[1].getName());
        System.out.println(petList[1].getSound());

        // getName() and getSound() work because they are defined in the Pet file.

        System.out.println(petList[0]);
        System.out.println(petList[1]);
        // toString() works because the method overwrites what is defined in the Pet file.

        /* methods that do not work:
        reduceLives()
        getBreed()
        they do not work because they are not defined in the Pet file.
        
        */
    }
}
