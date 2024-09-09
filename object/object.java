package object;
public class object {
    public static void main(String[] args) {
        teacher Kuei = new teacher("Chem",10);
        teacher Liu = new teacher("Math",11);
        teacher Vaz = new teacher();

        //for subject
        System.out.println(Vaz.getSubject());
        Liu.setSubject("Science");
        System.out.println(Liu.getSubject());

        //for grade
        System.out.println(Vaz.getGrade());
        Kuei.setGrade(11);
        System.out.println(Kuei.getGrade());
    }
}
