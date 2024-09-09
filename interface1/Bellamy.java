package interface1;

public class Bellamy implements MSJstuff {
    private int gpa;

    public Bellamy(){
        gpa = 5;
    }
    
    public int getGPA(){
        return gpa;
    }

    public void setGPA(int n){
        gpa = n;
    }

    public void displaylhospitalRule(){
        System.out.println("I dont know what this is :(");
    }

    public boolean isLiu(String x){
        if(x.equals("Super Fly"))
            return true;
        else return false;
    }

    public int round(double a){
        return (int)(a+0.5);
    }
}
