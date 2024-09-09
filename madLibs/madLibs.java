package madLibs;
import java.util.*;
public class madLibs
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String school;
        System.out.print("Enter a school name: ");
        school = in.nextLine();

        String name;
        System.out.print("Enter a name (male): ");
        name = in.nextLine();

        int num1;
        System.out.print("Enter a number: ");
        num1 = in.nextInt();
        in.nextLine();

        int num2;
        System.out.print("Enter a number: ");
        num2 = in.nextInt();
        in.nextLine();

        String videogame;
        System.out.print("Enter the name of a video game: ");
        videogame = in.nextLine();

        String day1;
        System.out.print("Enter a day of the week: ");
        day1 = in.nextLine();

        String food1;
        System.out.print("Enter a food: ");
        food1 = in.nextLine();

        String food2;
        System.out.print("Enter another food: ");
        food2 = in.nextLine();

        int num3;
        System.out.print("Enter a number: ");
        num3 = in.nextInt();
        in.nextLine();

        String bodypart1;
        System.out.print("Enter a bodypart: ");
        bodypart1 = in.nextLine();
        
        String teacher1;
        System.out.print("Enter a teacher name (male): ");
        teacher1 = in.nextLine();

        String food3;
        System.out.print("Enter a food: ");
        food3 = in.nextLine();

        int num4;
        System.out.print("Enter a number (two digit): ");
        num4 = in.nextInt();
        in.nextLine();

        String weapon1;
        System.out.print("Enter a weapon name: ");
        weapon1 = in.nextLine();

        String adj1;
        System.out.print("Enter an adjective (negative): ");
        adj1 = in.nextLine();

        String teacher2;
        System.out.print("Enter another teacher name (male): ");
        teacher2 = in.nextLine();

        String verb1;
        System.out.print("Enter a mode of transport (walk/swim/bike/drive etc.): ");
        verb1 = in.nextLine();

        double temp1;
        System.out.print("Enter a 2-digit negative number (float): ");
        temp1 = in.nextDouble();
        in.nextLine();
        temp1 = (temp1*9/5)+32;

        int num5;
        System.out.print("Enter a number (one digit): ");
        num5 = in.nextInt();
        in.nextLine();

        String vehicle1;
        System.out.print("Enter a type of vehicle: ");
        vehicle1 = in.nextLine();

        String metal1;
        System.out.print("Enter a type of metal: ");
        metal1 = in.nextLine();

        String object1;
        System.out.print("Enter an object: ");
        object1 = in.nextLine();

        String vehicle2;
        System.out.print("Enter another type of vehicle: ");
        vehicle2 = in.nextLine();

        String animal1;
        System.out.print("Enter an animal: ");
        animal1 = in.nextLine();

        int amount1;
        System.out.print("Enter an amount (number): ");
        amount1 = in.nextInt();
        in.nextLine();

        int amount2;
        System.out.print("Enter a smaller amount (number): ");
        amount2 = in.nextInt();
        in.nextLine();

        String animal2;
        System.out.print("Enter an another animal: ");
        animal2 = in.nextLine();

        String name2;
        System.out.print("Enter another name: ");
        name2 = in.nextLine();

        String drink1;
        System.out.print("Enter a drink: ");
        drink1 = in.nextLine();

        int num6;
        System.out.print("Enter another number: ");
        num6 = in.nextInt();
        in.nextLine();

        in.close();

        System.out.println("There was once a "+school+" kid called "+name+". "+name+" was part of "+num1+" clubs and took "+num2+" APs in freshmen year.");
        System.out.println("Somehow, "+name+" had a lot of time to meet with friends, play "+videogame+", and throw a party every "+day1+".");
        System.out.println("Unfortunately, "+name+" held too many parties, and ate too much "+food1+" and "+food2+". By the end of freshmen year, "+name+" weighted "+num3+" pounds.");
        System.out.println("He was very sad about being "+num3+" pounds, and absolutely hated his "+bodypart1+".");
        System.out.println("In the summer, "+name+" decided to transform and change things for the better. He asked his godfather "+teacher1+" where to start.");
        System.out.println(teacher1+", being the ladies man he is, advised "+name+" to take on a strict "+food3+" only diet. Unfortunately, 2 weeks down the line, he got sick of "+food3+".");
        System.out.println("He got mad at "+teacher1+" for that suggestion, and then they got into a fight. The epic battle lasted "+num4+" days, but "+name+" was no match for "+teacher1+"'s "+weapon1+".");
        System.out.println("Fortunately, the fight was long enough to reduce his weight, but now "+name+" lost his godfather.");
        System.out.println(adj1+" "+name+" now needed a new companion, so he went on a quest to find a new godfather. ");
        System.out.println("He read the legend about the great "+teacher2+" and how he got lost in Greenland.");
        System.out.println("He decided he will "+verb1+" all the way to Greenland, but found himself stranded close to the North Pole. ");
        System.out.println("It was a freezing "+temp1+" degrees, and became one with the icebergs. Little did he know, "+teacher2+" lived in an igloo only "+num5+" miles away from where he froze.");
        System.out.println(teacher2+" saw the poor boy freeze himself, and decided to help. He got on his "+vehicle1+" to get to "+name+" and save him.");
        System.out.println("He used his "+metal1+" "+object1+" to break the ice and set "+name+" free. "+name+" looks at "+teacher2+" in shock. He says: \"oh mighty "+teacher2+", thank you for saving my life.\"");
        System.out.println(teacher2+" replies: \"Hehe, don't be this stupid next time.\" "+name+" shows his gratitude, but "+teacher2+" refuses to be his godfather because of how irresponsible he is.");
        System.out.println("Depressed, he gets on a "+vehicle2+" and heads back home. Still lonely, "+name+" decides he will adopt a "+animal1+" instead.");
        System.out.println("He visits the nearest breeder and asks to adopt a "+animal1+". The breeder told him that the "+animal1+" will cost "+amount1+" dollars.");
        System.out.println(name+" looked at the breeder and said: \"For god sake I am a "+school+" student. Don't you have anything cheaper?\"");
        System.out.println("The breeder told "+name+" that he sells "+animal2+" at a much lower price. Reluctantly, he bought the "+animal2+" for "+amount2+" dollars.");
        System.out.println("He decided to name his "+animal2+" "+name2+". Surprisingly, they got along very well. "+name+" took "+animal2+" for a walk in the evenings.");
        System.out.println(name2+" would never eat "+name+"'s homework, but would always drink his "+drink1+". The "+animal2+" continued to live on for "+num6+" years, and finally made "+name+"'s life complete.");
    }
}