package implement;

public class implement implements IAmGroot {
    public int standardNum(){
        return Integer.MAX_VALUE;
    }
    public Shoe creator( Heel a ){
        Shoe x = a;
        return x;
    }
    public boolean[] meanTeacher(String[] x){
        boolean[]b = new boolean[x.length];
        for(int i = 0;i<x.length;i++){
            if(x[i].equals("Bellamy Liu")) b[i] = true;
            else b[i] = false;
        }
        return b;
    }
}
