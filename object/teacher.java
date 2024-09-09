package object;
public class teacher {
    private String subject;
    private int grade;

    //default
    public teacher()
    {
        subject = "PE";
        grade = 9;
    }
    //constructor
    public teacher(String s, int g)
    {
        subject = s;
        grade = g;
    }
    //getters
    public String getSubject()
    {
        return subject;
    }
    public int getGrade()
    {
        return grade;
    }
    //setters
    public void setSubject(String s)
    {
        subject = s;
    }
    public void setGrade(int g)
    {
        grade = g;
    }
}
/* 
This Object represents a teacher. He or she teaches a specific Subject to a specific grade level.
With this object, you can store a variable with the name of any teacher.
The variable will hold two values: the subject and the grade.
The default method will run when we create a variable for a teacher, but assign it with no values.
In that case, it will automatically assign the subject to "PE" and the grade to "9".
The constructor method will allow a user to create a teacher variable and assign values as they wish.
The getter functions will allow a user to access either the grade of the teacher, or the subject.
The setter functions will allow a user to change either the grade of the teacher, or the subject.
*/
