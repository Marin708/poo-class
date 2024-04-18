package ejercicio1;

public class gradeBookTest {
    public static void main(String[] args) {
        gradeBook planilla = new gradeBook();
        planilla.setCourseName("CS101 INTRODUCTION TO JAVA PROGRAMMING");
        gradeBook planilla1 = new gradeBook();
        planilla1.setCourseName("CS102 DATA STRUCTURES IN JAVA");

        String message = planilla.displayMessage();
        System.out.println(message);
        String message1 = planilla1.displayMessage();
        System.out.println(message1);
    }
}
