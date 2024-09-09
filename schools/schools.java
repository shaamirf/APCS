package schools;

public class schools {
    public static void main(String[] args) {
        school msj = new school("Jeff Evans",50);
        classroom b2 = new classroom("B2",35);
        student jennifer = new student("Jennifer",3.5);
        student george = new student("George",4.0);

        b2.setStudent(jennifer);
        b2.setStudent(george);

        msj.setClassroom(b2);

        System.out.println(msj.getClassroom()[0].getStudent()[0].getGPA());
    }
}
