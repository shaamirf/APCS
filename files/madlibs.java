package files;
import java.util.*;
import java.io.*; //import
public class madlibs {
    public static void main(String[] args) {
        //reading
        ArrayList<String>lines = new ArrayList<>();
        try{
            File input = new File("original.txt");
            Scanner in = new Scanner(input);
            while(in.hasNextLine()){
                String data = in.nextLine();
                ArrayList<String>words = split(data);
                nameSwap(words,"Romeo","Vishal");
                nameSwap(words,"(ROMEO)","(VISHAL)");
                nameSwap(words,"Juliet","Sahana");
                nameSwap(words,"(JULIET)","(SAHANA)");
                nameSwap(words,"Montague","Yathish");
                nameSwap(words,"Capulet","Kuchibhotla");

                data = merge(words);
                lines.add(data);
            }
            in.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occured");
        }
        try{
            FileWriter output = new FileWriter("newStory.txt");
            for(String s:lines){
                output.write(s+"\n");
            }

            output.close();
            System.out.println("Successfully wrote to the file");
        } catch(IOException e) {
            System.out.println("An error occured");
        }
    }
    public static ArrayList<String> split(String s){
        ArrayList<String>words = new ArrayList<>();
        int start = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.substring(i,i+1).equals(" ")){
                words.add(s.substring(start,i));
                start = i+1;
            }
        }
        words.add(s.substring(start,s.length()));
        return words;
    }
    public static void nameSwap(ArrayList<String>s, String name, String newname){
        for(int i=0;i<s.size();i++){
            if(s.get(i).equals(name)) s.set(i,newname);
            if(s.get(i).equals(name+".")) s.set(i,newname+".");
            if(s.get(i).equals(name+",")) s.set(i,newname+",");
            if(s.get(i).equals(name+"?")) s.set(i,newname+"?");
            if(s.get(i).equals(name+"!")) s.set(i,newname+"!");
        }
    }
    public static String merge(ArrayList<String>s){
        String str = "";
        for(String x:s) str = str + x+ " ";
        return str;
    }
}
