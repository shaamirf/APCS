package pemdas;

import java.util.*;

public class pemdas
{
    public static void main(String[] args)
    {
        //tool to use to grab inputs
        Scanner pencil = new Scanner(System.in);

        String name;

        /*
        int favNum;
        double gpa;
        
        System.out.println("What is your favorite number?");
        favNum = pencil.nextInt();
        pencil.nextLine(); //ENTER BUTTON
        System.out.println(favNum + " is a great number");

        System.out.println("What is your GPA?");
        gpa = pencil.nextDouble();
        pencil.nextLine();
        System.out.println(gpa+ " is amazing. Be like Mr. Jan and go to UCLA");*/

        System.out.println("What is your name?");
        name = pencil.nextLine();
        System.out.println("hiiiii "+name);
        pencil.close();
    }
}