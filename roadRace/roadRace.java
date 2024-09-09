package roadRace;
import java.util.*;

public class roadRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int racers = in.nextInt();
        in.nextLine();

        runner[]winners = {null,null,null,null,null,null};

        int t;
        String g;

        runner[]runners = new runner[racers];

        for(int i = 0; i<racers; i++)
        {
            System.out.print("Enter Time for Racer "+(i+1)+": ");
            t = in.nextInt();
            in.nextLine();
            System.out.print("Enter Gender for Racer "+(i+1)+" (m for male/f for female): ");
            g = in.nextLine();
            runners[i] = new runner(t,g,false);
        }
        in.close();
        
        for(int i = 0; i<2;i++) {
            winners[i] = getFastestRunner(runners);
        }

        while(winners[3]==null || winners[5]==null) {
            runner a = getFastestRunner(runners);
            if(a.getGender().equals("f")) {
                if(winners[2]==null) winners[2] = a;
                else if(winners[3]==null) winners[3] = a;
            }
            if(a.getGender().equals("m")) {
                if(winners[4]==null) winners[4] = a;
                else if(winners[5]==null) winners[5] = a;
            }
        }

        System.out.println(winners[0].getTime()+"\n"+winners[2].getTime()+"\n"+winners[4].getTime()+"\n"+winners[5].getTime());

    }
    public static runner getFastestRunner(runner[]r)
    {
        int len = r.length;
        int max = 0;
        for(int i = 0; i<len; i++)
        {
            if(r[i].getTime()>max) max = r[i].getTime();
        }
        int lowestTime = max;
        for(int i = 0; i<len; i++)
        {
            if(r[i].getTime()<=lowestTime && !r[i].getAward()) lowestTime = r[i].getTime();
        }
        for(int i = 0; i<len; i++)
        {
            if(!r[i].getAward() && r[i].getTime()==lowestTime){
                r[i].setAward(true);
                return r[i];
            }
        }
        return new runner(0,null,false); //filler 
    }
}
