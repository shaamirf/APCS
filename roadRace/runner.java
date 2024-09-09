package roadRace;

public class runner {
    private int time;
    private String gender;
    private boolean award;

    public runner(int t, String g, boolean a)
    {
        time = t;
        gender = g;
        award = a;
    }

    public int getTime(){
        return time;
    }
    public String getGender(){
        return gender;
    }
    public boolean getAward(){
        return award;
    }

    public void setTime(int t){
        time = t;
    }
    public void setString(String g){
        gender = g;
    }
    public void setAward(boolean a){
        award = a;
    }

    public String toString(){
        return "time: "+time+", gender: "+gender+", award: "+award;
    }
}
