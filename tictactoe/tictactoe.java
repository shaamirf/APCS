package tictactoe;
import java.util.*;

public class tictactoe
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int game = 1;
        int counter = 1;
        int turns = 1;

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        String s5 = "5";
        String s6 = "6";
        String s7 = "7";
        String s8 = "8";
        String s9 = "9";

        System.out.println(s1+"|"+s2+"|"+s3);
                System.out.println("_ _ _");
                System.out.println(s4+"|"+s5 +"|"+s6);
                System.out.println("_ _ _");
                System.out.println(s7+"|"+s8+"|"+s9);

        while(game==1)
        {   if(counter==1)
            {   
                counter+=1;
                turns+=1;
                boolean exit = false;

                String position;
                System.out.println("Player 1 Pick a position #");
                position = in.nextLine();

                if(position.equals(s1)) s1 = "X";
                if(position.equals(s2)) s2 = "X";
                if(position.equals(s3)) s3 = "X";
                if(position.equals(s4)) s4 = "X";
                if(position.equals(s5)) s5 = "X";
                if(position.equals(s6)) s6 = "X";
                if(position.equals(s7)) s7 = "X";
                if(position.equals(s8)) s8 = "X";
                if(position.equals(s9)) s9 = "X";


                System.out.println(s1+"|"+s2+"|"+s3);
                System.out.println("_ _ _");
                System.out.println(s4+"|"+s5 +"|"+s6);
                System.out.println("_ _ _");
                System.out.println(s7+"|"+s8+"|"+s9);

                if (s1==s2 && s2==s3) exit = true;
                if (s4==s5 && s5==s6) exit = true;
                if (s7==s8 && s8==s9) exit = true;
                if (s1==s5 && s5==s9) exit = true;
                if (s3==s5 && s5==s7) exit = true;
                if (s1==s4 && s4==s7) exit = true;
                if (s2==s5 && s5==s8) exit = true;
                if (s3==s6 && s6==s9) exit = true;

                if(exit==true)
                {
                    System.out.println("PLayer 1 Wins!");
                    game = 0;
                }
                if(turns==9)
                {
                    System.out.println("Stalemate!");
                    game = 0;
                }
            }
            else
            {
                counter-=1;
                turns+=1;
                boolean exit = false;

                String position;
                System.out.println("Player 2 Pick a position #");
                position = in.nextLine();

                if(position.equals(s1)) s1 = "O";
                if(position.equals(s2)) s2 = "O";
                if(position.equals(s3)) s3 = "O";
                if(position.equals(s4)) s4 = "O";
                if(position.equals(s5)) s5 = "O";
                if(position.equals(s6)) s6 = "O";
                if(position.equals(s7)) s7 = "O";
                if(position.equals(s8)) s8 = "O";
                if(position.equals(s9)) s9 = "O";

                System.out.println(s1+"|"+s2+"|"+s3);
                System.out.println("_ _ _");
                System.out.println(s4+"|"+s5 +"|"+s6);
                System.out.println("_ _ _");
                System.out.println(s7+"|"+s8+"|"+s9);

                if (s1==s2 && s2==s3) exit = true;
                if (s4==s5 && s5==s6) exit = true;
                if (s7==s8 && s8==s9) exit = true;
                if (s1==s5 && s5==s9) exit = true;
                if (s3==s5 && s5==s7) exit = true;
                if (s1==s4 && s4==s7) exit = true;
                if (s2==s5 && s5==s8) exit = true;
                if (s3==s6 && s6==s9) exit = true;

                if(exit==true)
                {
                    System.out.println("PLayer 2 Wins!");
                    game = 0;
                }
                if(turns==9)
                {
                    System.out.println("Stalemate!");
                    game = 0;
                }
            }
        }
        in.close();
    }
}