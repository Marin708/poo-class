package poo5;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook planilla = new GradeBook();
        planilla.setCourseName("CS101 introduccion a programacion de java");
        GradeBook planilla1 = new GradeBook();
        planilla1.setCourseName("CS102 estructura de datos en java");

        String message = planilla.displayMessage();
        System.out.println(message);
        String message1 = planilla1.displayMessage();
        System.out.println(message1);
    }
}
