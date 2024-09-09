package schools;

public class student {
    private String name;
    private double gpa;

    public student(String n, double g)
    {
        name = n;
        gpa = g;
    }

    public String getName(){
        return name;
    }

    public double getGPA(){
        return gpa;
    }

    public void setName(String n){
        name = n;
    }
    public void setGPA(double g){
        gpa = g;
    }

    public String toString(){
        return "name: "+name+", GPA: "+gpa;
    }
}
