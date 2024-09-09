package schools;

public class school {
    private String name;
    private classroom[]c;

    public school(String a, int i){
        name = a;
        c = new classroom[i];
        for(int j = 0;j<i;j++)
            c[j] = null;
    }

    public String getName(){
        return name;
    }
    public classroom[] getClassroom(){
        return c;
    }

    public void setName(String n){
        name = n;
    }

    public void setClassroom(classroom x){
        int i = 0;
        int j = c.length;
        boolean run = true;
        while(i<j && run)
        {
            if(c[i]==null){
                c[i] = x;
                run = false;
            }
            i++;
        }
    }

    public String toString(){
        return "name: "+name+", # of students: "+c.length;
    }
}
