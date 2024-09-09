package schools;

public class classroom {
    private String name;
    private student[]s;

    public classroom(String a, int i){
        name = a;
        s = new student[i];
        for(int j = 0;j<i;j++)
            s[j] = null;
    }

    public String getName(){
        return name;
    }
    public student[] getStudent(){
        return s;
    }

    public void setName(String n){
        name = n;
    }

    public void setStudent(student x){
        int i = 0;
        int j = s.length;
        boolean run = true;
        while(i<j && run)
        {
            if(s[i]==null){
                s[i] = x;
                run = false;
            }
            i++;
        }
    }

    public String toString(){
        return "name: "+name+", # of students: "+s.length;
    }
}

