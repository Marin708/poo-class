package poo5;

public class GradeBook {
    private String courseName;
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public GradeBook(){}
    public String displayMessage(){
        return "bienvenido a la planilla, el curso es: " + getCourseName();
    }
}
